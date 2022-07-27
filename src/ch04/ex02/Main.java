package ch04.ex02;

import config.Configuration;

public class Main {
	public static void main(String[] args) {
		Map mapper = Configuration.getMapper(Map.class);
		
		mapper.selectUsers().forEach(System.out::println);
	}
}

/*
1 john 2022-07-22 [���� �ʿ� ���� �����, ��� �ʿ� ���� �����]
2 terry 2022-07-23 [����� ���г�������� ���� �����̴�., ���Ҷ� �װ� �׸���., ��ġ �װ� �־�� ���� ����.]
*/