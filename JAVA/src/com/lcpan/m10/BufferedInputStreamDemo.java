package com.lcpan.m10;

import java.io.*;

public class BufferedInputStreamDemo {
	public static void main(String[] args) {
		try {
			File file = new File("C:\\testDir\\input.txt");
			FileInputStream fis = new FileInputStream(file);
			BufferedInputStream bis = new BufferedInputStream(fis);
			byte[] data = new byte[bis.available()];
			bis.read(data);
			String str = new String(data);
			System.out.println(str);
			bis.close();
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
