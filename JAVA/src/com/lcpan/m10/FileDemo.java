package com.lcpan.m10;

import java.io.*;

public class FileDemo {
	public static void main(String[] args) throws Exception {
		File dir = new File("C:\\dir");
		dir.mkdir();
		System.out.println(dir.isDirectory());
		File file = new File(dir, "input.txt");
		file.createNewFile();
		System.out.println(file.isFile());
		File newDir = new File("C:\\testDir");
		dir.renameTo(newDir);
		System.out.println(file.getName());
	}
}
