package com.lcpan.m06;

public class Child extends Parent {

	public void getParentData() {
	//	System.out.println(field1);  // The field Parent.field1 is not visible
		System.out.println(getField1());
		System.out.println(field2);
	}
}
