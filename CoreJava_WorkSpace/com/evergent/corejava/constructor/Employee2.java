package com.evergent.corejava.constructor;

public class Employee2 {
	int empno;
	String empname;
	int empsal;
	
	Employee2(){
		System.out.println("deafult constructor");
	}
	Employee2(int empno1,String empname1,int empsal1){
		empno=empno1;
		empname=empname1;
		empsal=empsal1;
	}
	public void display() {
		System.out.println("Employee number:"+empno);
		System.out.println("Employee name:"+empname);
		System.out.println("Employee salary:"+empsal);
	}

	public static void main(String[] args) {
		new Employee2();
		Employee2 emp=new Employee2(22,"mouni",5500);
		emp.display();
	}

}
