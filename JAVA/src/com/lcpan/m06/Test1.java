package com.lcpan.m06;

public class Test1 {

	public static void main(String[] args) {
		Parent1 parent = new Parent1("Parent1");
		parent.printData();
		Child1 child = new Child1("Parent2", "Child2");
		child.printData();
	}

}
