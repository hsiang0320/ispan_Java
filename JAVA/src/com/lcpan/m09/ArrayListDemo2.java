package com.lcpan.m09;

import java.util.*; 

public class ArrayListDemo2 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
        List list = new ArrayList();
        list.add(12); 
        list.add(34);
        list.add(67);
        int sum = 0;
        for (int i = 0; i < list.size(); i++)
        	sum += (int)list.get(i);
        System.out.println(sum);
        sum = 0;
        for (Object num : list)
        	sum += (int)num;
        System.out.println(sum);
    }
}
