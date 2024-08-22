package com.evergent.corejava.Exceptionhandling;
class InSufficientFundsException extends Exception{
	public InSufficientFundsException(String message) {
		super(message);
	}
}
public class UserDefinedExceptionDemo1 {
	public static void withdraw(Double amount) throws InSufficientFundsException{
		int balance=5000;
		if(amount>balance) {
			throw new InSufficientFundsException("insufficient funds for withdrawl");
			
		}
	}

	public static void main(String[] args) {
		try {
			withdraw(6000.00);
		}catch(Exception e) {
			System.out.println("Caught InSufficientFunds Exception:"+e.getMessage());
			System.out.println(e);
			
		}
System.out.println("program ends...");
	}

}
