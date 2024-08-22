package com.evergent.corejava.Exceptionhandling;

import java.util.Scanner;
import java.util.*;
import java.io.*;

public class CompileTimeExceptionDemo1 {

	public static void main(String[] args) {
		try {
			File file=new File("C:/myData1/myInfo1/welcome.txt");
			Scanner scr=new Scanner(file);
			while(scr.hasNextLine()) {
				System.out.println(scr.nextLine());
			}
			scr.close();
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}

	}

}
