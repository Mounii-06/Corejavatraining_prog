package com.evergent.corejava.abstract1;
/*we are not creating object directly we can use reference 
 * so that only abstract methods are implemented local method are not implemented.
 */
public class ProductImp2 extends Product{
	public void newProduct() {
		System.out.println("new product method in product class");
	}
	public void show() {
		System.out.println("Local method");
	}

	public static void main(String[] args) {
		Product p1=new ProductImp2();
		p1.newProduct();
		p1.allProducts();
		//p1.show();

	}

}
