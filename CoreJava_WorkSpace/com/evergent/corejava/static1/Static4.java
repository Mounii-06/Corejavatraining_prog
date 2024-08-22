package com.evergent.corejava.static1;

public class Static4 {
	static int a=10;
	int b=20;
	static public void myData() {
		System.out.println("static method");
	}
	public void myData1() {
		System.out.println("non-static method");
		myData();//acessing static method in non-static method
		}
	public static void main(String[] args) {
		Static4.myData();
		System.out.println(Static4.a);
		Static4 st=new Static4();
		System.out.println(st.b);
		st.myData1();

	}

}
