package ch05.domain;

public class Search {
	@SuppressWarnings("unused")
	private String userName;
	@SuppressWarnings("unused")
	private Post post;
	
	public Search(String userName, Post post) {
		this.userName = userName;
		this.post = post;
	}	
}
