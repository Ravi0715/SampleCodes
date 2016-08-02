package org.tasks;

import java.util.Scanner;

public class TemparatureConversion {

	public static void main(String[] args) {
		
		String c,f;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter temperature in celsius");
		c=in.next();
		System.out.println(c);
		//int x=c.contains("c")?celsius(c):farnheit(c);
		String temp[] = c.split(" ");
		Integer i = new Integer(temp[0]);
		//f=(i*9/5)+32;
		//System.out.println((i*9/5)+32+" f");
		
	}
	static int celsius(String c){
		
		return 0;
		
	}

	static int farnheit(String c){
		return 0;
	}
}
