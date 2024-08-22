package com.evergent.corejava.Exceptionhandling;

public class ArrayIndexOutOfBoundException {

	public static void main(String[] args) {
		int[] numbers= {1,2,3,4};
		try {
			System.out.println("Accessing element at index 10:"+numbers[10]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Caught an exception:"+e.getMessage());
			System.out.println("error:"+e);
		}
		System.out.println("program ends.....");
	}

}
