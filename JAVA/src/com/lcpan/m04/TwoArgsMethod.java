package com.lcpan.m04;

public class TwoArgsMethod {
	
	static int sum(int x, int y) {
        int z;
        z = x + y;
        return z; 
    } // end of sum()
	
    public static void main(String[] args) {
        int a = 5, b = 6, c;
        c = sum(a, b);    
        System.out.println(a + "+" + b + "=" + c);
    }

}
