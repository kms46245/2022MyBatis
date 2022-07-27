package ch02.ex01;

import java.util.List;

import ch02.domain.User;

public interface Map {
	List<User> selectUsers();	// list는 안에 값이없어도 list가 호출
}
