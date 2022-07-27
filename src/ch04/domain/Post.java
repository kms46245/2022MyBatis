package ch04.domain;

public class Post {
	private String title;
	private String content;
	
	@Override
	public String toString() {
		return String.format("%s %s", title, content);
	}
}
