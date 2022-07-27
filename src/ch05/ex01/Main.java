package ch05.ex01;

import ch05.domain.Post;
import ch05.domain.Search;
import ch05.domain.User;
import config.Configuration;

public class Main {
	public static void main(String[] args) {
		Map mapper = Configuration.getMapper(Map.class);
		
		User user = mapper.selectUser(new Search("john", null));
		
		// post���� ������̵� �ϳ��������� ������ �ϱ⿡ �ش� �κ��� �����ϴ� if�� ����(������ �������)
		// isEmpty() ���� ��
		//User user2 = mapper.selectUser(new Search("john", new Post("����", null)));
		User user3 = mapper.selectUser(new Search("john", new Post(null, "��")));
		
		// isEmpty() ���� ��
		User user4 = mapper.selectUser(new Search("john", new Post("", "��")));
		User user5 = mapper.selectUser(new Search("john", new Post("���", "")));
	
		
		System.out.println(user);
		//System.out.println(user2);
		System.out.println(user3);
		System.out.println(user4);
		System.out.println(user5);
	}
}
