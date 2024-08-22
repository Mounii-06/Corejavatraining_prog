package com.evergent.corejava.constructor;

public class Employee3 {
	int empid;
	String empname;
	int Salary;
	Employee3(){
		System.out.println("default constructor");
	}
	Employee3(int empid,String empname,int Salary){
		this.empid=empid;
		this.empname=empname;
		this.Salary=Salary;	
	}
	public void display() {
		System.out.println("employee id:"+empid);
		System.out.println("employee name:"+empname);
		System.out.println("employee Salary:"+Salary);
	}
	public static void main(String[] args) {
		new Employee3();
		Employee3 emp3=new Employee3(123,"naidu",45000);
		emp3.display();
	}
}
