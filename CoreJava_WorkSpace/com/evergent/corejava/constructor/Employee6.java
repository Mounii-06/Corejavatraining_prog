package com.evergent.corejava.constructor;

 class Myemployee6 {
	 int eno;
	public Myemployee6(){
		System.out.println("parentclass default constructor");
	}
	Myemployee6(int eno){
		this.eno=eno;
		System.out.println("Employee no:"+eno);
	}
 }
public class Employee6 extends Myemployee6{
	String name;
	int age;
	Employee6(){
		System.out.println("subclass deafult constructor");
	}
	Employee6(int eno,String name,int age){
		super(eno);
		this.name=name;
		this.age=age;
	}

public void display() {
	
	System.out.println("EmployeeNumber:"+eno);
	System.out.println("Name:"+name);
	System.out.println("Age:"+age);
	
}
public static void main(String[] args) {
		new Employee6();
		Employee6 emp=new Employee6(23,"mouni",123);
		emp.display();
	}
}
