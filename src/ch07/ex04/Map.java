package ch07.ex04;

import org.apache.ibatis.annotations.Update;

import ch07.domain.User;

public interface Map {
	@Update("update users "
			+ "set user_name = #{userName}, reg_date = #{regDate} "
			+ "where user_id = #{userId}")
	int updateUser(User user);
}
