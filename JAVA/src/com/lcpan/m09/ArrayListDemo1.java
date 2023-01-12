package com.lcpan.m09;

import java.util.*; 

public class ArrayListDemo1 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		List list = new ArrayList();
        list.add(12);
        list.add(6.8);
        list.add("Hello");
        list.add(12);   // duplicate, is added
        System.out.println(list);
        list.add(1, "test");
        System.out.println(list);
        list.remove(4);
        System.out.println(list);
	}

}
