package com.evergent.corejava.Exceptionhandling;
class InvalidScoreException extends Exception{
	public InvalidScoreException(String message) {
		super(message);
	}
}
public class UserDefinedExceptionDemo2 {
	public static void checkScore(int Score) throws InvalidScoreException{
		if(Score>0||Score<120) {
			throw new InvalidScoreException("Invalid Score");
		}else {
			System.out.println("valid score");
		}}
	public static void main(String[] args) {
try {
	checkScore(130);
}catch(Exception e){
	System.out.println("InvalidScoreException:"+e.getMessage());
	e.printStackTrace();
}
System.out.println("program ends....");
	}

}
