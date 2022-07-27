-- using user 'system'
-- mybatis에 관련된 유저, 스키마,객체등을 한번에 없앤다.
drop user mybatis cascade;

--과제] mybatis/mybatis user를 만들어라.
create user mybatis identified by mybatis default tablespace users;
grant connect, resource to mybatis;

--과제] 테이블설계도를 보고 테이블 3개를 만들어라
--     테이블명에 접두사를 붙여야 그 유저의 테이블로 생성된다.
/*
create table mybatis.users(
    user_id number(2) constraint user_userid_pk primary key,
    user_name varchar2(12),
    reg_date date);

create table mybatis.addresses(
    user_id number(2) constraint addr_userid_pk primary key
                      constraint addr_userid_fk
                      references mybatis.users(user_id),
    address varchar2(30));
  
create table mybatis.posts(
    post_id number(3) constraint posts_postid_pk primary key,
    post_title varchar2(60),
    post_content varchar2(120),
    user_id number(2) constraint posts_userid_fk
                      references mybatis.users(user_id));

--table 확인
desc dba_tables
select owner, table_name, tablespace_name
from dba_tables
where owner = 'MYBATIS';
*/

-- cf) table을 제작하는 다른 방법(table을 먼저 만들고 차후에 제약조건을 건다)
create table mybatis.users(
    user_id number(2),
    user_name varchar2(12),
    reg_date date);
    
create table mybatis.addresses(
    user_id number(2),
    address varchar2(30));
    
create table mybatis.posts(
    post_id number(3),
    post_title varchar2(60),
    post_content varchar2(120),
    user_id number(2));
    
alter table mybatis.users
    add constraint user_userid_pk primary key(user_id);
alter table mybatis.addresses
    add constraint addr_userid_pk primary key(user_id);
alter table mybatis.posts
    add constraint post_postid_pk primary key(post_id);

alter table mybatis.addresses
    add constraint addr_userid_fk foreign key(user_id)
    references mybatis.users(user_id);
    
alter table mybatis.posts
    add constraint post_userid_fk foreign key(user_id)
    references mybatis.users(user_id);
    
--정보 입력
insert into mybatis.users
    values(1, 'john', to_date('2022-07-22', 'yyyy-mm-dd'));
insert into mybatis.users
    values(2, 'terry', to_date('2022-07-23', 'yyyy-mm-dd'));

insert into mybatis.addresses
    values(1, '서울시 마포구');
insert into mybatis.addresses
    values(2, '성남시 분당구');

insert into mybatis.posts
    values(101, '사랑', '너와 나의 연결고리', 1);
insert into mybatis.posts
    values(102, '정의', '너와 나의 연대고리', 1);
insert into mybatis.posts
    values(201, '김치', '네가 있어야 밥을 먹지.', 2);
insert into mybatis.posts
    values(202, '비빔밥', '동학농민향쟁이 만든 음식이다.', 2);
insert into mybatis.posts
    values(203, '찹쌀떡', '네가 그리워.', 2);
    
commit;

-- sqlplus를 이용한 사용법
-- 1. cmd에서 해당 dir로 이동
-- 2. sqlplus -s (유저/비밀번호) < (실행파일.sql) 입력