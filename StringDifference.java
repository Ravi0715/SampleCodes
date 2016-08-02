package org.tasks;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StringDifference {
	
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = in.next();
		System.out.println("Enter the character");
		char ch = in.next().charAt(0);
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==ch&&s.charAt(0)==ch&&i>0)
			{
				System.out.print(i-1+",");
			}
			else
			{
				continue;
			}
		}
	}

}
