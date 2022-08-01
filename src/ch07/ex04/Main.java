package ch07.ex04;

import java.time.LocalDate;

import ch07.domain.User;
import config.Configuration;

public class Main {
	public static void main(String[] args) {
		Map mapper = Configuration.getMapper(Map.class);
		
		System.out.println(mapper.updateUser(
				new User(11, "grant", LocalDate.of(2030, 3, 3))));
	}
}
