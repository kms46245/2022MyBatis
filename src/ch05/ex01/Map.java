package ch05.ex01;

import ch05.domain.Search;
import ch05.domain.User;

public interface Map {
	User selectUser(Search search);
}
