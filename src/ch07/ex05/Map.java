package ch07.ex05;

import org.apache.ibatis.annotations.Delete;

public interface Map {
	@Delete("delete users where user_id = #{userId}")
	int deleteUser(int userId);
	
}
