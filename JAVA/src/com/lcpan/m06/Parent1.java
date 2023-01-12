package com.lcpan.m06;

public class Parent1 {
	private String field1;
	
	public Parent1(String field1) {
		this.field1 = field1;
	}
	
	public String getField1() {
		return field1;
	}
	
	public void setField1(String field1) {
		this.field1 = field1;
	}
	
	public void printData() {
		System.out.println("field1 : " + field1);
	}

}
