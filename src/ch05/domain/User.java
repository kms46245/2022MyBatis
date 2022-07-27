package ch05.domain;

import java.time.LocalDate;
import java.util.List;

public class User {
	private int userId;
	private String userName;
	private LocalDate regDate;
	private List<Post> posts;
	//여러개의 도메인이 연결된다면 list<(domain)>으로 표현
	
	public User(int userId, String userName, LocalDate regDate) {
		this.userId = userId;
		this.userName = userName;
		this.regDate = regDate;
	}
	
	@Override
	public String toString() {
		return String.format("%d %s %s %s", userId, userName, regDate, posts);
	}
}