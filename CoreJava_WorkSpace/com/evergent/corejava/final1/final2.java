package com.evergent.corejava.final1;

public class final2 {
	final String name="mounika";
	final public void myData() {
		System.out.println("Hello");
		//name="naidu";  The final field final2.name cannot be assigned
	}
	public static void main(String[] args) {
		final2 f2=new final2();
		System.out.println(f2.name);
		f2.myData();

	}

}
