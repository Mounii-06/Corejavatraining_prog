package com.evergent.corejava.final1;

final class final44 {
	final String name="mouni";
	final public void myData1() {//method cant be overriden when we declare the method as final
		System.out.println("hello");
	}
public class finalDemo{ 
	 public void myData1() {
		System.out.println("hi");
		//name="naidu";
	}
	
}
	public static void main(String[] args) {
		final44 fi=new final44();
		fi.myData1();

	}

}
