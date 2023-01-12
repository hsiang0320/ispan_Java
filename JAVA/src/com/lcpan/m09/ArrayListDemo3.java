package com.lcpan.m09;

import java.util.*; 

public class ArrayListDemo3 {
	public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(); // since jdk 1.6
        list.add(12); 
        list.add(34);
        list.add(67);
        int sum = 0;
        for (int i = 0; i < list.size(); i++)
        	sum += list.get(i);
        System.out.println(sum);
        sum = 0;
        for (int num : list)
        	sum += num;
        System.out.println(sum);
    }
}
