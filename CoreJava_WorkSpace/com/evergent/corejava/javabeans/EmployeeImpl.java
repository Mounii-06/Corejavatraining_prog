package com.evergent.corejava.javabeans;

public class EmployeeImpl {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setEno(10);
		emp.setEname("mouni");
		emp.setSal(5500);
		System.out.println("employee number:"+emp.getEno());
		System.out.println("employee name:"+emp.getEname());
		System.out.println("employee salary:"+emp.getSal());

	}

}
