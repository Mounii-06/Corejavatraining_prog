package com.evergent.corejava.constructor;

public class Copyconstr {
	String name;
	int age;
	Copyconstr(String name,int age){
		this.name=name;
		this.age=age;
	}
	Copyconstr(Copyconstr c){
		this.name=c.name;
		this.age=c.age;
	}
	public void display() {
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
	}

	public static void main(String[] args) {
		Copyconstr c=new Copyconstr("Mouni",20);
		Copyconstr c1=new Copyconstr(c);
		c.display();
		c1.display();
	}
}
