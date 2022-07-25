package ch02.ex01;

import java.util.List;

import ch02.domain.User;
import config.Configuration;

public class Main {
	public static void main(String[] args) {
		Map mapper = Configuration.getMapper(Map.class);
		
		List<User> users = mapper.selectUsers(); // 이부분이 call되는 순간 oracle로 request를 보내게된다.
		users.forEach(System.out::println); // lambda 보다 더짧게 줄여쓸수 있다 ::을 통해
	}
}
