package aPProgressCheck;

public class Book {
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public void printBookInfo() {
		System.out.println(title + ", written by " + author);
	}
	

}
