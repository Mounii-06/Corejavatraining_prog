package com.evergent.corejava.static1;

public class Static6 {
	static String name="Mouni";
	int age=22;
	String address="Hyderabad";
	public void display() {
		name="naidu";
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Address:"+address);	
	}
	public static void main(String[] args) {
		Static6 st=new Static6();
		System.out.println(st.name);
		st.display();
		Static6 st1=new Static6();
		System.out.println(st1.name);

	}

}
