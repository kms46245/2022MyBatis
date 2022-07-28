package ch07.ex03;

import org.apache.ibatis.annotations.Insert;

import ch07.domain.User;

public interface Map {
	@Insert("insert into users " +
			"values(#{userId}, #{userName, jdbcType=VARCHAR}, #{regDate})")
	int insertUser(User user);
}
