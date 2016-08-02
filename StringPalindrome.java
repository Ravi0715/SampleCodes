package org.tasks;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String args[])
	{
		String s1;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter String");
		s1=in.next();
		StringBuffer sb = new StringBuffer();
		for(int i=s1.length()-1;i>=0;i--)
		{
			char ch=s1.charAt(i);
			sb.append(ch);
		}
		if(sb.toString().equals(s1))
			System.out.println("Palindrome");
		else
			System.out.println("not Palindrome..");
	}
}
