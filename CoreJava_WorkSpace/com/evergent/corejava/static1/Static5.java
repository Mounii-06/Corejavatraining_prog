package com.evergent.corejava.static1;

public class Static5 {
	static int a=10;
	int b=20;
	static {
		System.out.println("static block");//static block is executed automatically without calling in the main method.
	}
	static public void myData() {
		System.out.println("static method");
	}
	public void myData1() {
		System.out.println("non-static method");
	}
	public static void main(String[] args) {
		Static5 st=new Static5();
		System.out.println(st.b);
		Static5.myData();
		System.out.println(Static5.a);

	}

}
