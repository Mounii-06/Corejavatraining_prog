package com.evergent.corejava.abstract1;
/*constructor cannot be called directly using object creation in abstract class so 
  we are creating child class and creating object in the child class and using reference to call the constructor
 */
public class ProductImp3 extends product3{
	public ProductImp3(){
		System.out.println("child class constructor");
	}
	public void show() {
		System.out.println("Local method");
	}
	public void newMethod() {
		System.out.println("welcome to new method");
		
	}
	public static void main(String[] args) {
		ProductImp3 pi=new ProductImp3();
		pi.allProducts();
		pi.show();
		pi.newMethod();

	}
	
	
	

}
