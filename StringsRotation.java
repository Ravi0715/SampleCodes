package org.tasks;

import java.util.Scanner;

public class StringsRotation {

	public static boolean isRotated(String s1, String s2) {
		if (s1.length()!=s2.length())
			return false;
		int len = s1.length();

		// double String "s2";
		s2 = s2+s2;
		for (int i=0;i<len;i++) {
			if (s2.substring(i,i+len).equals(s1))
				return true;
		}

		return false;
	}
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string1 and string2");
		String s1 = in.next();
		String s2 = in.next();
		if(StringsRotation.isRotated(s1, s2))
			System.out.println("True");
		else
			System.out.println("False");

	}

}
