package com.evergent.corejava.logicalprogramming;

import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("enter the number");
		int n=scr.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
			
		}
		System.out.println(fact);

	}

}
