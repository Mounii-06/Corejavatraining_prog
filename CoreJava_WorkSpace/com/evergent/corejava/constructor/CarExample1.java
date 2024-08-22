package com.evergent.corejava.constructor;

public class CarExample1 {
	String color;
	int maxSpeed;
	CarExample1(){
		 color="white";
		 maxSpeed=100;
	}
	CarExample1(String color,int maxSpeed){
		this.color=color;
		this.maxSpeed=maxSpeed;	
	}
	public void display() {
		System.out.println("Color:"+color);
		System.out.println("Maxspeed:"+maxSpeed);
	}
	public static void main(String[] args) {
		CarExample1 cr=new CarExample1();
	CarExample1 ce=new CarExample1("Red",200);
	cr.display();
	ce.display();
	}

}
