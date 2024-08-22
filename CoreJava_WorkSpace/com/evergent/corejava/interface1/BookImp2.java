package com.evergent.corejava.interface1;
//100% percent abstraction i.e;interface is achieved as no local method is executed.
public class BookImp2 implements Book{
	public void bookAuthor() {
		System.out.println("James Gosling");
	}
	public void bookTitle() {
		System.out.println("JAVA");
	}
	public void bookPrice() {
		System.out.println("price is 650");
	}
	public void show() {
		System.out.println("This is local method welcome....");
	}

	public static void main(String[] args) {
		Book b2=new BookImp2();/*object is created to book class and provided reference
		 to BookImp2 so no local methods are executed*/
		b2.bookAuthor();
		b2.bookTitle();
		b2.bookPrice();
		//b2.show();
		

	}

}
