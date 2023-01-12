package com.lcpan.m06;

public class Child1 extends Parent1 {
	private String field2;
	
	public Child1(String field1, String field2) {
		super(field1);
		this.field2 = field2;
	}
	
	public String getField2() {
		return field2;
	}
	
	public void setField2(String field2) {
		this.field2 = field2;
	}
	
	public void printData() {
		super.printData();
		System.out.println("field2 : " + field2);
	}
}
