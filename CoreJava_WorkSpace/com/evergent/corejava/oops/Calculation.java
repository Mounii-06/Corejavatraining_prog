package com.evergent.corejava.oops;

public class Calculation {
	int a=10;
	int b=20;
	public void Addition(){
		int c=a+b;
		System.out.println(c);
	}
	public void Multiplication() {
		int c=a*b;
		System.out.println(c);
	}
	public void Subtraction() {
		int c=a-b;
		System.out.println(c);
	}
	public void Division() {
		int c=a/b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		Calculation c=new Calculation();
		c.Addition();
		c.Multiplication();
		c.Subtraction();
		c.Division();
		}
		

	}
