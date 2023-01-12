package com.lcpan.m05;

public class ObjectArray {
	public static void main(String[] args) {
        Employee1[] emps = new Employee1[3];
        emps[0] = new Employee1(111, "Tom");
        emps[1] = new Employee1(222, "Mary");
        emps[2] = new Employee1(333, "David");
        for (int i = 0; i < emps.length; i++)
             emps[i].printData();
        for (Employee1 emp : emps)
             emp.printData();
	}
}
