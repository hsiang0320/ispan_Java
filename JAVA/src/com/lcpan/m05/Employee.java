package com.lcpan.m05;

public class Employee {
	int empno; // ���u�N��
	String name; // ���u�m�W

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
