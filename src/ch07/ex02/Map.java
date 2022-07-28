package ch07.ex02;

import org.apache.ibatis.annotations.Select;

import ch07.domain.User;

public interface Map {
	@Select("select user_id userId, user_name userName, reg_date regDate " + 
			"from users " + 
			"where user_id = #{userId}")  
	User selectUser(int userId);
}
