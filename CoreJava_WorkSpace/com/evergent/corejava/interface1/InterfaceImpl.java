package com.evergent.corejava.interface1;

public class InterfaceImpl implements MyInterface {
	@Override
	public void display() {
System.out.println("hai welcome");	
	}
	@Override
	public int myData(int a, int b) {
		int add=a+b;
		return add;	
	}

	@Override
	public int myData(int a, int b, int c) {
		int add=a+b+c;
		return add;
	}

	public static void main(String[] args) {
		InterfaceImpl impl=new InterfaceImpl();
		impl.display();
		System.out.println(impl.myData(10, 20));
		System.out.println(impl.myData(10,20,30));
	}

	

}
