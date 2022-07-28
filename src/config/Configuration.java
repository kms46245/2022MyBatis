package config;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Configuration {
	private static SqlSessionFactory sqlSessionFactory;
	
	static {
		try {
			//reader �̿�
			Reader reader = Resources.getResourceAsReader("config/sqlMapConfig.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			// inputStream �̿� (ch06)
			/*InputStream stream = Resources.getResourceAsStream("config/sqlMapConfig.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(stream, "hr"); // ����ϴ� ȯ��(environment)������ ������ id�� 2��° value�� �Է�*/
		} catch(Exception e) {}
	}
	
	public static <T> T getMapper(Class<T> arg) {
		return sqlSessionFactory.openSession(true).getMapper(arg); // auto commit�� ���� true�� ���� ����
	}
}
