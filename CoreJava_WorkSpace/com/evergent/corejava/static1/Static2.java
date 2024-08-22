package com.evergent.corejava.static1;

public class Static2 {
	static String ename="mouni";
	String name="naidu";
	static public void myData() {
		System.out.println("static method");
	}
	public void Data() {
		System.out.println("non-static method");
	}

	public static void main(String[] args) {
    System.out.println(Static2.ename);
    Static2.myData();
	}

}
