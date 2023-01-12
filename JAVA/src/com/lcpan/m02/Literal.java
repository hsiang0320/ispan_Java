package com.lcpan.m02;

public class Literal {
	public static void main(String[] args) {
		int x = 0100;//八進位
		System.out.println(x);
		x=0x100;//十六進位
		System.out.println(x);
		double d = 3.4E12;
		System.out.println(d);
		char c ='A';
		System.out.println(c);
		c='\u0041';//Ascii code
		System.out.println(c);
	}
}
