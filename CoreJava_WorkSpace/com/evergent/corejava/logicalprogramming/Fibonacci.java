package com.evergent.corejava.logicalprogramming;
import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("enter the sequence");
		int n=scr.nextInt();
		int n1=0;
		int n2=1;
		System.out.print(n1+" "+n2+" ");
		int n3;
		for(int i=2;i<n;i++) {
			n3=n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
		}
	}

}
