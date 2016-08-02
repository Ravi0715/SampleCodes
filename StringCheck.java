package org.tasks;

import java.util.Scanner;

public class StringCheck {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = in.next();
		System.out.println("Enter Starting position");
		int sp = in.nextInt();
		System.out.println("Enter no. of characters");
		int ep = in.nextInt();
		//String sub = s.substring(sp, sp+ep);
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(i>=sp&&i<sp+ep)
			{
				count++;
				if(count<=1)
				{
					System.out.print("(");
					for(int j=sp;j<sp+ep;j++)
					{
						System.out.print(s.charAt(j));
					}
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
