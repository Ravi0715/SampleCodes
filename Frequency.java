package org.tasks;

import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String s;
		System.out.println("Enter the string");
		s=in.next();
		int len = s.length();
		int count=0;
		char ch;
		System.out.println("Characters  Frequency");
		for(char i='a';i<'z';i++)
		{
			count = 0;
			for(int j=0;j<len;j++)
			{
				ch = s.charAt(j);
				if(ch==i)
					count++;
			}
			if(count>0)
			{
				System.out.println(i+"  \t\t"+count);
			}
		}

	}

}
