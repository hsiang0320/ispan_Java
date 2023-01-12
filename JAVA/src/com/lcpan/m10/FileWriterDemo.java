package com.lcpan.m10;

import java.io.*;

public class FileWriterDemo {
	public static void main(String[] args) throws Exception {
		// append data
		FileWriter fw =	new FileWriter("C:\\testDir\\output.txt", true);
		fw.write("This is a test!\n");
		fw.close();
	}
}
