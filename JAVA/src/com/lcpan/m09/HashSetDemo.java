package com.lcpan.m09;

import java.util.*; 

public class HashSetDemo
{
	public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        int i1 = 12;
        int i2 = 34;
        int i3 = 67;
        set.add(i1);
        set.add(i2);
        set.add(i3);
        set.add(12);   // duplicate, is not added
        System.out.println(set.size());
        System.out.println(set);
        set.remove(i1);
        System.out.println(set);
 	}
}
