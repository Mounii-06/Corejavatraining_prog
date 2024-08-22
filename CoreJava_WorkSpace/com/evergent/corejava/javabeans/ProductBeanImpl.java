package com.evergent.corejava.javabeans;

public class ProductBeanImpl {

	public static void main(String[] args) {
		ProductBean pb=new ProductBean(100,"iphone",90000);
		System.out.println("Product number:"+pb.getPno());
		System.out.println("Product name:"+pb.getPname());
		System.out.println("Product price:"+pb.getPrice());
		

	}

}
