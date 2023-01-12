package com.lcpan.m09;

import java.util.*;

public class HashMapDemo2 {
	public static void main(String[] args) {
		Map<String,String> tel = new HashMap<>();
		tel.put("John", "0939111111");
		tel.put("Mary", "0935222222");
		tel.put("Jean", "0931333333");
		for (String key : tel.keySet())
			System.out.println(tel.get(key));
		for (String val : tel.values())
			System.out.println(val);
	}
}
