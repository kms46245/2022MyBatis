package ch02.domain;

import java.time.LocalDate;

// 과제] users relation과 mapping 할 User object를 디자인하라.
public class User {
	private int userId;
	private String userName;
	private LocalDate regDate;
	
	public User(int userId, String userName, LocalDate regDate) {
		this.userId = userId;
		this.userName = userName;
		this.regDate = regDate;
	}	
		
	@Override
	public String toString() {
		return String.format("%d %s %s", userId, userName, regDate);
	}
}
