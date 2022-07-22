package ch01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Main {
	public static void main(String[] args) {
		final String DB_URL =
				"jdbc:oracle:thin:@127.0.0.1:1521:XE";
								//IP주소:port:localhost
		final String DB_USER = "mybatis";
		final String DB_PASSWORD = "mybatis";
		
		Connection conn = null;    		// connection
		PreparedStatement stmt = null; 	// query
		ResultSet rs = null; 			// table
		
		
		// 처리 받지못할 경우의 예외상황을 할때마다 쳐줘야한다.
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// byte code를 불러온다.
			conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			
			String query = "SELECT USER_ID, USER_NAME, REG_DATE";
			query += " FROM USERS"; // spaghetti code - SQL, java를 난잡하게 섞어쓴상태
			stmt = conn.prepareStatement(query);
			rs = stmt.executeQuery();
			//query를 oracle로 보내준다.
			
			//OR mapping(Object Relation)
			User user = null;
			while(rs.next()) {
				user = new User();
				user.setUserId(rs.getInt(1));
				user.setUserName(rs.getString(2));
				user.setRegDate(rs.getDate(3));
				
				System.out.println(user);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			}catch(Exception e) {}
		}
	}
}
