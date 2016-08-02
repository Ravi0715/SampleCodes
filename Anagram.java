package org.tasks;

import java.util.Scanner;

public class Anagram {
	
	public static void main(String args[])
	{
	
		Scanner in = new Scanner(System.in);
		int ascii1=0,ascii2=0;
		System.out.println("Enter string1");
		String s1=in.next();
		System.out.println("Enter string2");
		String s2 =in.next();
		for(int i=0;i<s1.length();i++)
		{		
			char ch =s1.charAt(i);
			ascii1+=ch;
		}
		for(int i=0;i<s2.length();i++)
		{
			char ch =s2.charAt(i);
			ascii2+=ch;
		}
		if(ascii1==ascii2)
			System.out.println("Anagram..");
		else
			System.out.println("Not Anagram");
		
		
	}
	

}
