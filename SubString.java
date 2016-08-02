package org.tasks;

import java.util.Scanner;

public class SubString {
	
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = in.next();
		System.out.println("Enter the starting position");
		int sp = in.nextInt();
		System.out.println("Enter the end position");
		int ep =in.nextInt();
		StringBuffer sb = new StringBuffer(s.subSequence(sp, sp+ep));
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(i>=sp&&i<sp+ep)
			{
				count++;
				if(count<=1)
				{
					System.out.print("(");
					System.out.print(sb.reverse());
					System.out.print(")");
				}
			}
			else
			{
				System.out.print(s.charAt(i));
			}
		}
		
	}

}
