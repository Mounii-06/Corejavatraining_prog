package com.evergent.corejava.strings;
/*creating immutable String by defining class as final and variables as private ,
and overriding toString method to return the values*/
public final class ImmutableString {
	private final String name;
	private final int age;
	public ImmutableString(String name,int age) {
		this.name=name;
		this.age=age;	
	}
	/*public String myName1() {
		return name;
	}
	public int myAge1() {
		return age;
	}*/
	@Override
	public String toString() {
		return name+age;
	}
}
