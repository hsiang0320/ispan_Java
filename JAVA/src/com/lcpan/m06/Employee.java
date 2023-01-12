package com.lcpan.m06;

public class Employee {
	private int empno;
	private String name;

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setEmpno(111);
		emp.setName("Tom");
		System.out.println(emp.getEmpno() + "," + emp.getName());		
	}
}
