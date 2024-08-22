package com.evergent.corejava.errors;

public class StackOverflowError16 {
	public static void main(String[] args) {
		try {
			recursiveMethod();
		}catch(StackOverflowError e) {
			System.out.println("StackOverflowError caught:"+e.getMessage());
		}
	}
	public static void recursiveMethod() {
		recursiveMethod();
	}

}
