package com.evergent.corejava.oops;

public class MethodsFlow {
	int a=10,b=20;
	//no parameters no return type
	public void Show() {
		System.out.println("no parameters no return type");
	}
	// parameters no return type
	public void addition(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	//no parameters with return type
	public int Multiplication() {
		return 100;	
	}
	// parameters return type
	public int Division(int a,int b) {
		return a/b;	
	}

	public static void main(String[] args) {
		MethodsFlow mf=new MethodsFlow();
		mf.Show();
		mf.addition(9, 10);
		int m=mf.Multiplication();
		System.out.println(m);
		int k=mf.Division(6, 2);
		System.out.println(k);
	}

}
