package com.evergent.corejava.abstract1;
/*if any class extends abstract class that class should be 
 override all abstract methods.otherwise shows compile-time error
 * we cannot create object to abstract class,but we can create reference to abstract class.
 */
public class ProductImp1 extends Product{
public void newProduct() {
	System.out.println("new product belongs to product class");
}
public void show() {
	System.out.println("Local method");
}
	public static void main(String[] args) {
		ProductImp1 pi=new ProductImp1();
		pi.allProducts();
		pi.newProduct();
		pi.show();

	}

}
