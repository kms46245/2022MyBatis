package ch05.ex07;

import java.util.Arrays;
import java.util.List;

import ch05.domain.User;
import config.Configuration;

public class Main {
	public static void main(String[] args) {
		Map mapper = Configuration.getMapper(Map.class);
		
		//장점 - 필요없는 null값이 빠진다.
		List<User> users = mapper.selectUsers(new int[] {1, 2});
		List<User> users2 = mapper.selectUsers2(Arrays.asList("john", "king"));
		users.forEach(System.out::println);
		users2.forEach(System.out::println);
		
	}
}
