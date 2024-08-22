package com.evergent.corejava.constructor;

public class Employee5 {
	int eno;
	String ename;
	int esal;
	Employee5(){
		System.out.println("Default constructor");
	}
	Employee5(int eno){
		this.eno=eno;
	}
	Employee5(int eno,String ename,int esal){
		this(eno);
		this.ename=ename;
		this.esal=esal;
	}
	public void display() {
		System.out.println("Employee number:"+eno);
		System.out.println("Employee name:"+ename);
		System.out.println("Employee salary:"+esal);
	}

	public static void main(String[] args) {
		new Employee5();
		Employee5 emp=new Employee5(123,"Mouni",2300);
		emp.display();
		

	}

}
