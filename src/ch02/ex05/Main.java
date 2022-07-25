package ch02.ex05;

import config.Configuration;

public class Main {
	public static void main(String[] args) {
		Map mapper = Configuration.getMapper(Map.class);
		
		if(mapper.deleteUser(11) > 0)
			System.out.println("11번 삭제 성공");
	}
}
