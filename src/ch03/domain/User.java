package ch03.domain;

import java.time.LocalDate;

import org.apache.ibatis.type.Alias;
// �ش� ������ ���� �ڵ����� ��ϵ� user��� �̸��� �ٸ� é���� �̸��� �ߺ��Ǿ� ��ȣ������ ����������.
// �׷��Ƿ� ������ ������ �ٿ��ش�.
@Alias("myUser")
public class User {
	private int userId;
	private String userName;
	private LocalDate regDate;
	// ����] users �� addresses������ relationship�� �������϶�.
	private Address address; //address�� ������ or mapping�� �����ʾҴ�.
	
	@Override
	public String toString() {
		return String.format("%d %s %s %s", userId, userName, regDate, address);
	}
}
