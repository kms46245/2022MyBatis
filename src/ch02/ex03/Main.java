package ch02.ex03;

import java.time.LocalDate;

//import ch02.domain.User;
import config.Configuration;

public class Main {
	public static void main(String[] args) {
		Map mapper = Configuration.getMapper(Map.class);
		
		/*if(mapper.insertUser(new User(11, "abel", LocalDate.now())) > 0)
			System.out.println("���� 11");*/
		
		// �Է��� ������ column�� �ٸ�Ÿ��(null)�� �����ԵǸ� error
		// �̷� ������ �����ʵ��� sqlmap���� ����ó���� �Ѵ�.
		/*if(mapper.insertUser(new User(12, null, null)) > 0)
			System.out.println("���� 12");*/
		
		// �Է��� �Ķ���Ͱ��� �����Ķ���ͷ� �ν��������ϰ� error�� ����.
		// �׷��Ƿ� mapper���� annotation���� �ν��ϰ� ����������Ѵ�.
		/*if(mapper.insertUser2(13, "kianu", LocalDate.of(2022, 8, 15)) > 0)
			System.out.println("���� 13");*/
		
		// annotation�� �����ʰ� sqlMap���� �Ķ���͸� �������ټ��� �ִ�(�������� ������)
		if(mapper.insertUser3(14, "neo", LocalDate.now()) > 0)
			System.out.println("���� 14");
		
		
	}
}
