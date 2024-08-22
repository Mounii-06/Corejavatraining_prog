package com.evergent.corejava.Exceptionhandling;
class InvalidAgeException extends Exception{
public InvalidAgeException(String message) {
	super(message);
}}
public class UserDefinedExceptionDemo {
public static  void checkAge(int age) throws InvalidAgeException{
	if(age<18) {
		throw new InvalidAgeException("age must be greater than 18");
	}else {
		System.out.println("Access granted-eligible");
	}
}
	public static void main(String[] args) {
		try {
			checkAge(17);
		}catch(InvalidAgeException e) {
			System.out.println("Caught the exception:"+e.getMessage());
			System.out.println(e);
		}
		System.out.println("program ends");
	}
}
