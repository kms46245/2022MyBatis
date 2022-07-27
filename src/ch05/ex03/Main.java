package ch05.ex03;

import java.util.List;

import ch05.domain.Post;
import ch05.domain.Search;
import ch05.domain.User;
import config.Configuration;

public class Main {
	public static void main(String[] args) {
		Map mapper = Configuration.getMapper(Map.class);
		
		List<User> users = mapper.selectUsers(new Search(null,null));
		List<User> users2 = mapper.selectUsers(new Search("john",null));
		List<User> users3 = mapper.selectUsers(new Search("john",new Post("정의", null)));
		List<User> users4 = mapper.selectUsers(new Search(null,new Post("정의", null)));
		List<User> users5 = mapper.selectUsers(new Search(null,new Post(null, "동학")));
				
		users.forEach(System.out::println); 
		System.out.println();
		users2.forEach(System.out::println);
		System.out.println();
		users3.forEach(System.out::println);
		System.out.println();
		users4.forEach(System.out::println);
		System.out.println();
		users5.forEach(System.out::println);
	}
}
