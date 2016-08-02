package org.tasks;

import java.util.Scanner;

public class StringSample {
	
	public static boolean isRotated(String s1,String s2)
	{
		String s3 = s1.substring(1, 3);
		String s4 = s1.substring(0,1)+s1.substring(3, s1.length())+s3;
		if(s2.equalsIgnoreCase(s4))
			return true;
		else
			return false;
		
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string s1 and string s2");
		String s1 = in.next();
		String s2 =in.next();
		if(isRotated(s1, s2))
			System.out.println("True");
		else
			System.out.println("False");
	}

}
