package ch05.ex02;

import ch05.domain.Post;
import ch05.domain.Search;
import ch05.domain.User;
import config.Configuration;

public class Main {
	public static void main(String[] args) {
		Map mapper = Configuration.getMapper(Map.class);
		
		User user = mapper.selectUser(new Search("john", 
				new Post(null, null)));
	
		User user2 = mapper.selectUser(new Search("john",
				new Post("정의", null)));
		
		User user3 = mapper.selectUser(new Search("john",
				new Post(null,"고리")));
		
		System.out.println(user);
		System.out.println(user2);
		System.out.println(user3);
	 
	}
}