package ch03.ex01;

import config.Configuration;

public class Main {
	public static void main(String[] args) {
		Map mapper = Configuration.getMapper(Map.class);
		
		mapper.selectUsers().forEach(System.out::println);
	}
}
