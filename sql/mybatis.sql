-- using user 'system'
-- mybatis�� ���õ� ����, ��Ű��,��ü���� �ѹ��� ���ش�.
drop user mybatis cascade;

--����] mybatis/mybatis user�� ������.
create user mybatis identified by mybatis default tablespace users;
grant connect, resource to mybatis;

--����] ���̺��赵�� ���� ���̺� 3���� ������
--     ���̺�� ���λ縦 �ٿ��� �� ������ ���̺�� �����ȴ�.
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

--table Ȯ��
desc dba_tables
select owner, table_name, tablespace_name
from dba_tables
where owner = 'MYBATIS';
*/

-- cf) table�� �����ϴ� �ٸ� ���(table�� ���� ����� ���Ŀ� ���������� �Ǵ�)
create table mybatis.users(
    user_id number(2),
    user_name varchar2(12),
    reg_date date);
    
create table mybatis.addresses(
    user_id number(2),
    adrress varchar2(30));
    
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
    
--���� �Է�
insert into mybatis.users
    values(1, 'john', to_date('2022-07-22', 'yyyy-mm-dd'));
insert into mybatis.users
    values(2, 'terry', to_date('2022-07-23', 'yyyy-mm-dd'));

insert into mybatis.addresses
    values(1, '����� ������');
insert into mybatis.addresses
    values(2, '������ �д籸');

insert into mybatis.posts
    values(101, '���', '�ʿ� ���� �����', 1);
insert into mybatis.posts
    values(102, '����', '�ʿ� ���� �����', 1);
insert into mybatis.posts
    values(201, '��ġ', '�װ� �־�� ���� ����.', 2);
insert into mybatis.posts
    values(202, '�����', '���г�������� ���� �����̴�.', 2);
insert into mybatis.posts
    values(203, '���Ҷ�', '�װ� �׸���.', 2);
    
commit;

-- sqlplus�� �̿��� ����
-- 1. cmd���� �ش� dir�� �̵�
-- 2. sqlplus -s (����/��й�ȣ) < (��������.sql) �Է�