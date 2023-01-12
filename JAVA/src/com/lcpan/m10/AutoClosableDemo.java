package com.lcpan.m10;

import java.io.*;

public class AutoClosableDemo {
	public static void main(String[] args) {
		File file = new File("D:\\testDir\\input.txt");
		try (FileInputStream fis = new FileInputStream(file);
			BufferedInputStream bis = new BufferedInputStream(fis);
		){
			byte[] data = new byte[fis.available()];
			bis.read(data);
			String str = new String(data);
			System.out.println(str);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
