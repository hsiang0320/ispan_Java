package com.lcpan.m10;

import java.io.*;

public class FileOutputStreamDemo {
	public static void main(String[] args) {
		try (FileInputStream fis = 
				new FileInputStream("C:\\testDir\\input.txt");
			FileOutputStream fos =
				new FileOutputStream("C:\\testDir\\output.txt");) {
			byte[] data = new byte[fis.available()];
			fis.read(data);			
			fos.write(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
