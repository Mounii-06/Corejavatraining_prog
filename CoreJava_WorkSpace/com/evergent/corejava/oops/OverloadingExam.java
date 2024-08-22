package com.evergent.corejava.oops;

public class OverloadingExam {
	public  void LoginDetails() {
		System.out.println("Login details");
	}
	public void LoginDetails(String username,String password) {
		System.out.println("Username:"+username);
		System.out.println("Password:"+password);	
	}
	public void LoginDetails(String username,String password,String captcha) {
		System.out.println("Username:"+username);
		System.out.println("Password:"+password);
		System.out.println("Captcha:"+captcha);
	}
	public void LoginDetails(int mobile,String password) {
		System.out.println("Mobile:"+mobile);
		System.out.println("Password:"+password);	
	}
	public void LoginDetails(int mobile,String password,String captcha) {
		System.out.println("Mobile:"+mobile);
		System.out.println("Password:"+password);
		System.out.println("Captcha:"+captcha);
	}

	public static void main(String[] args) {
		OverloadingExam ld=new OverloadingExam();
		ld.LoginDetails();
		ld.LoginDetails("mouni","mouni123");
		ld.LoginDetails("mouni","mouni123","abcD");
		ld.LoginDetails(111111,"mouni123");
		ld.LoginDetails(11111,"mouni123","hapY");
		
		

	}

}
