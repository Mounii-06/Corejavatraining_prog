package com.evergent.corejava.objectclassmethods;

class Data {
	String name;
	int age;
	public Data(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public String toString(){
		return name+age;
	}
}
public class ObjectClass_Method1{
	public static void main(String[] args) {
		Data oc=new Data("naidu",21);
		System.out.println(oc);
		System.out.println(oc.hashCode());	
	}
}
