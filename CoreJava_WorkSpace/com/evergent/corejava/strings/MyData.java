package com.evergent.corejava.strings;

public class MyData {
	/*Accessing ImmutableString class variables 
	 by creating object to ImmutableString class
	 */
	public static void main(String[] args) {
		ImmutableString im=new ImmutableString("naidu",44);
		System.out.println("Name and age of a person:"+im.toString());
	}

}
