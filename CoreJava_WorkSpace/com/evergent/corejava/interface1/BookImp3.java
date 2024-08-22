package com.evergent.corejava.interface1;
/*Multiple inheritance is achieved using interfaces.
(methods inside Book,NewBook(inside methods of myDataInfo as it is extending myDataInfo))*/
public class BookImp3 implements Book,NewBook{
	public void bookAuthor() {
		System.out.println("James Gosling");
	}
	public void bookTitle() {
		System.out.println("Java");
	}
	public void bookPrice() {
		System.out.println("price is 750");
	}
	public void show() {
		System.out.println("local method");
	}
	public void addBook() {
		System.out.println("new book addbook method");
	}
	public void myData() {
		System.out.println("My data info method");
	}
	public static void main(String[] args) {
		BookImp3 bi3=new BookImp3();/*creation of object to BookImp3 so 
		that we can access local methods also in it.*/
		bi3.bookAuthor();
		bi3.bookTitle();
		bi3.bookPrice();
		bi3.show();
		bi3.addBook();
		bi3.myData();

	}

}
