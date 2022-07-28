package ch07.ex02;

import config.Configuration;

public class Main {
	public static void main(String[] args) {
		Map mapper = Configuration.getMapper(Map.class);
				
		System.out.println(mapper.selectUser(11));
	}
}
