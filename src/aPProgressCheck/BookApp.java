package aPProgressCheck;

import java.util.ArrayList;

public class BookApp {

	public static void main(String[] args) {
		PictureBook myBook = new PictureBook("Peter and Wendy", "J.M. Barrie", "F.D. Bedford");
		myBook.printBookInfo();
		
		Book book1 = new Book("Frankenstein", "Mary Shelley");
		Book book2 = new PictureBook("The Wonderful Wizard of Oz", "L. Frank Baum", "W.W. Winslow");
		ArrayList<Book> myLibrary = new ArrayList<Book>();
		myLibrary.add(book1);
		myLibrary.add(book2);
		
		BookListing listing1 = new BookListing(book1, 10.99);
		listing1.printDescription();
		
		BookListing listing2 = new BookListing(book2, 12.99);
		listing2.printDescription();

	}

}
