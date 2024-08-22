package com.evergent.corejava.static1;

public class Static3 {
 static int a=10;
 String b="mouni";
 static public void myData(){
	 //dataMy() static methods cant acess instance variables and methods.
	 System.out.println("static variable");
 }
 public void dataMy() {
	 System.out.println("non-static variable");
 }
	public static void main(String[] args) {
		myData();
		System.out.println(Static3.a);
		Static3 st=new Static3();
		System.out.println(st.b);
		st.dataMy();

	}

}
