package org.IOSTREAMS;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Prog1 {

	public static void main(String args[]) throws IOException 
	{
		FileInputStream fis = new FileInputStream("D://ravi//emp.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
	}
	
}
