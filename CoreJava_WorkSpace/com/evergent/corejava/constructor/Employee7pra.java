package com.evergent.corejava.constructor;

public class Employee7pra {
	int a;
	int b;
	int add;
	Employee7pra(){
		System.out.println("DEFAULT CONSTRUCTOR");
	}
	Employee7pra(int a,int b){
		this.a=a;
		this.b=b;
		add=a+b;
	}
	public void display() {
		System.out.println(add);
	}
	public static void main(String[] args) {
		new Employee7pra();
		Employee7pra emp=new Employee7pra(10,20);
		emp.display();
		
				
		
		

	}

}
