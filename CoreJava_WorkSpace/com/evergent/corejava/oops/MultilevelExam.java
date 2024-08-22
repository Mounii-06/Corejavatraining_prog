package com.evergent.corejava.oops;
class PersonDetails{
	public void PersonInfo() {
		System.out.println("hai");
	}
 }
	class PersonDetailss extends PersonDetails{
		public void PersonData() {
			System.out.println("hello");
		
	}
	}
 class MultilevelExam extends PersonDetailss{
			public void PersonInformation() {
				System.out.println("hey");
			}
 
public static void main(String[] args) {
	MultilevelExam pc=new MultilevelExam();
		pc.PersonInfo();
		pc.PersonData();
		pc.PersonInformation();
		

	}
}
 



