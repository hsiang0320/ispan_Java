package com.lcpan.m07;

public class Employee {
	int empno;
	String name;
	static int count;

	public Employee(int empno, String name) {
		this.empno = empno;
		this.name = name;
		count++;
	}

	public void printData() {
		System.out.print("Empno = " + empno);
		System.out.println(", Name = " + name);
	}

	public static int getCount() {
		return count;
	}
	
	public static void main(String[] args) {
		Employee[] emps = new Employee[3];
		emps[0] = new Employee(111, "Tom");
		emps[1] = new Employee(222, "Mary");
		emps[2] = new Employee(333, "David");
		for (Employee emp : emps)
			emp.printData();
		System.out.println("employee count = " + Employee.getCount()); // 3
	}
}
