package com.evergent.corejava.abstract1;
/*abstract is a keyword
 * abstract class have abstract and concrete methods
 * if any class having one abstract method then that class should 
 be declared as abstract otherwise shows compile-time error.
 */
abstract public class Product {
	abstract public void newProduct();
	public void allProducts() {
		System.out.println("All products are available");
	}

}
