package com.evergent.corejava.strings;

public class MainPerson {
/*Accessing PersonImmutable class variables 
 by creating object to PersonImmutable class
 */
	public static void main(String[] args) {
		PersonImmutable pi=new PersonImmutable("raju",23);
		System.out.println("Name:"+pi.myName());
		System.out.println("Age:"+pi.myAge());
		

	}

}
