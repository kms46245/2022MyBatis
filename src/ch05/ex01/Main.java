package ch05.ex01;

import ch05.domain.Post;
import ch05.domain.Search;
import ch05.domain.User;
import config.Configuration;

public class Main {
	public static void main(String[] args) {
		Map mapper = Configuration.getMapper(Map.class);
		
		User user = mapper.selectUser(new Search("john", null));
		
		// post에는 어느쪽이든 하나만있으면 만족을 하기에 해당 부분을 만족하는 if을 실행(순서는 관계없음)
		// isEmpty() 적용 전
		//User user2 = mapper.selectUser(new Search("john", new Post("정의", null)));
		User user3 = mapper.selectUser(new Search("john", new Post(null, "고리")));
		
		// isEmpty() 적용 후
		User user4 = mapper.selectUser(new Search("john", new Post("", "고리")));
		User user5 = mapper.selectUser(new Search("john", new Post("사랑", "")));
	
		
		System.out.println(user);
		//System.out.println(user2);
		System.out.println(user3);
		System.out.println(user4);
		System.out.println(user5);
	}
}
