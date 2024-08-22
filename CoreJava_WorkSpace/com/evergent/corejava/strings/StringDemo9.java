package com.evergent.corejava.strings;

public class StringDemo9 {
//split method in String splits the String based on the passed String value.
	public static void main(String[] args) {
		String str="Java is a powerful Programming Language";
		String[] words=str.split(" ");
		for(String wo:words) {
			System.out.println(wo);
		}
			

	}

}
