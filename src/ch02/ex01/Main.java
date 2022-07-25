package ch02.ex01;

import java.util.List;

import ch02.domain.User;
import config.Configuration;

public class Main {
	public static void main(String[] args) {
		Map mapper = Configuration.getMapper(Map.class);
		
		List<User> users = mapper.selectUsers(); // �̺κ��� call�Ǵ� ���� oracle�� request�� �����Եȴ�.
		users.forEach(System.out::println); // lambda ���� ��ª�� �ٿ����� �ִ� ::�� ����
	}
}
