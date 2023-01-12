package com.lcpan.m09;

import java.util.*; 

public class HashMapDemo1 {
	public static void main(String[] args) {
		Map<String,String> tel1 = new HashMap<>();
        tel1.put("John", "0939111111");
        tel1.put("Mary", "0935222222");
        tel1.put("Jean", "0931333333");
        Map<String,String> tel2 = new HashMap<>();
        tel2.put("sean", "0939444444");
        tel2.put("Mary", "0935555555");
        tel2.put("Jean", "0931666666");
        tel1.putAll(tel2);
        System.out.println(tel1.get("John"));
        System.out.println(tel1.get("Mary"));
        System.out.println(tel1.get("Jean"));
        System.out.println(tel1.get("sean"));        
    }
}
