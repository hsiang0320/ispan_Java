package com.lcpan.m05;

public class Employee {
	int empno; // 員工代號
	String name; // 員工姓名

	public void printData() {
		System.out.print("Empno = " + empno);
		System.out.println(", Name = " + name);
	}

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.empno = 111;
		emp.name = "Tom";
		emp.printData();
	}
}
