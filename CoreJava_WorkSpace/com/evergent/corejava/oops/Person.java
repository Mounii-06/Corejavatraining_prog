package com.evergent.corejava.oops;

public class Person {
	String name="mounika";
	int age=22;
	String address="Hyderabad";
	public void display() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(address);
	}

	public static void main(String[] args) {
		Person p=new Person();
		p.display();
	}

}
