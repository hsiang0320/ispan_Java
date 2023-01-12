package com.lcpan.m10;

import java.io.*;

public class FileInputStreamDemo {
	public static void main(String[] args) throws Exception {
		File file = new File("C:\\testDir\\input.txt");
		FileInputStream fis = new FileInputStream(file);
		byte[] data = new byte[fis.available()];
		fis.read(data);
		String str = new String(data);
		System.out.println(str);
		fis.close();
	}
}
