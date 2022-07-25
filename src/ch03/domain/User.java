package ch03.domain;

import java.time.LocalDate;

import org.apache.ibatis.type.Alias;
// 해당 유저에 대해 자동으로 등록된 user라는 이름이 다른 챕터의 이름과 중복되어 모호해지면 에러가난다.
// 그러므로 임의의 별명을 붙여준다.
@Alias("myUser")
public class User {
	private int userId;
	private String userName;
	private LocalDate regDate;
	// 과제] users 와 addresses사이의 relationship을 디자인하라.
	private Address address; //address의 정보는 or mapping이 되지않았다.
	
	@Override
	public String toString() {
		return String.format("%d %s %s %s", userId, userName, regDate, address);
	}
}
