package com.evergent.corejava.strings;
/*creating immutable String by defining class as final and variables as private 
userdefined methods myName() and myAge() methods to return the values*/
public final class PersonImmutable {
	private final String name;
	private final int age;
	public PersonImmutable(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public String myName() {
		return name;
	}
	public int myAge() {
		return age;
	}
}
