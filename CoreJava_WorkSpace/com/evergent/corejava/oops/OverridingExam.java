package com.evergent.corejava.oops;
class  Methodover{
	public void myData(){
		System.out.println("hello");
	}
}
public class OverridingExam extends Methodover{
	public void myData() {
		System.out.println("hi");
	}
public void show() {
	System.out.println("local method");
}
public static void main(String[] args) {
	OverridingExam mr=new OverridingExam();
		mr.myData();
		mr.show();	
	}
}
