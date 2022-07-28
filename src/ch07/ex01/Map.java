package ch07.ex01;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import ch07.domain.User;

public interface Map {
	@Select("select user_id userId, user_name userName, reg_date regDate "
			+ "from users "
			+ "order by user_id")
	List<User> selectUsers();
}
