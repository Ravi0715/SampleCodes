package org.tasks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamImpl {

	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream(new File("D:\\itemset.txt"));
		
		int ch;
		while((ch=fis.read())!=-1)
		{
			System.out.print((char)ch);
			
		}

	}

}
