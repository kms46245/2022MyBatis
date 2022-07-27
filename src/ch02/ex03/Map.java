package ch02.ex03;

import java.time.LocalDate;

import org.apache.ibatis.annotations.Param;

import ch02.domain.User;

public interface Map {
	int insertUser(User user);
	
	// 각 파라미터를 불러올때는 annotation을 이용해야한다. 그러지않으면 user파라미터로 myBatis가 인식하지못함.
	int insertUser2(@Param("userId") int userId,
					@Param("userName") String userName,
					@Param("regDate") LocalDate regDate);
	
	// 이곳에 파라미터를 지정하지않고, SQLMap에서 지정할 수도있지만, 가독성이 떨어진다.
	int insertUser3(int userId, String userName, LocalDate regDate);
}
