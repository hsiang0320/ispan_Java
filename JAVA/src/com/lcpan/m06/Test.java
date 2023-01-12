package com.lcpan.m06;

public class Test {

	public static void main(String[] args) {
		Child child = new Child();
		child.setField1(10);
		child.setField2(20);
	//	System.out.println(child.field1); // The field Parent.field1 is not visible
		System.out.println(child.getField1());
		System.out.println(child.field2);
		child.getParentData();
	}

}
