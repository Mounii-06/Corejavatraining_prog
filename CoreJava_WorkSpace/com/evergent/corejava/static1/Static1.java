package com.evergent.corejava.static1;

public class Static1 {
	static int a=10;
	static public void myData() {
		System.out.println("MyData");
	}

	public static void main(String[] args) {
		System.out.println(Static1.a);
		Static1.myData();
		
	}

}
