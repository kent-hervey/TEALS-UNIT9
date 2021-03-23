package aPProgressCheck;

public class BookListing {
	
	private Book myBook;
	private double cost;
	
	public BookListing (Book book, double cost) {
		this.myBook = book;
		this.cost = cost;
	}
	
	public void printDescription() {
		myBook.printBookInfo();
		System.out.println(", $" + cost);
	}

}
