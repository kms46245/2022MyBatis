package ch02.ex03;

import java.time.LocalDate;

//import ch02.domain.User;
import config.Configuration;

public class Main {
	public static void main(String[] args) {
		Map mapper = Configuration.getMapper(Map.class);
		
		/*if(mapper.insertUser(new User(11, "abel", LocalDate.now())) > 0)
			System.out.println("성공 11");*/
		
		// 입력할 유저의 column이 다른타입(null)로 들어오게되면 error
		// 이런 실행이 되지않도록 sqlmap에서 예외처리를 한다.
		/*if(mapper.insertUser(new User(12, null, null)) > 0)
			System.out.println("성공 12");*/
		
		// 입력한 파라미터값을 유저파라미터로 인식하지못하고 error가 난다.
		// 그러므로 mapper에서 annotation으로 인식하게 지정해줘야한다.
		/*if(mapper.insertUser2(13, "kianu", LocalDate.of(2022, 8, 15)) > 0)
			System.out.println("성공 13");*/
		
		// annotation을 쓰지않고 sqlMap에서 파라미터를 지정해줄수도 있다(가독성은 떨어짐)
		if(mapper.insertUser3(14, "neo", LocalDate.now()) > 0)
			System.out.println("성공 14");
		
		
	}
}
