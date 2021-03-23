package aPProgressCheck;

public class PictureBook extends Book {
	
	private String illustrator;
	
	public PictureBook(String title, String author, String illustrator) {
		super(title, author);
		
		this.illustrator = illustrator;
	}
	
	public void printBookInfo() {
		super.printBookInfo();
		System.out.println(" and illustrated by " + illustrator);
	}
	
	
}
