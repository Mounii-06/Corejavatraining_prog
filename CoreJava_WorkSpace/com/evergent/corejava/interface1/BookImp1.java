package com.evergent.corejava.interface1;
/*implementing book interface methods in BookImp1
(where abstract as well as local methods are also executed.*/
public class BookImp1 implements Book{
		public void bookAuthor() {
			System.out.println("James Gosling"+" "+cname);
		}
		public void bookTitle() {
			System.out.println("Java");
		}
		public void bookPrice() {
			System.out.println("price is 550");
		}
		public void show() {
			System.out.println("local method");
		}
		public static void main(String[] args) {
			BookImp1 bi=new BookImp1();
			bi.bookAuthor();
			bi.bookTitle();
			bi.bookPrice();
			bi.show();		
	}
}
