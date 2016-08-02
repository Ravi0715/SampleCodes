package org.tasks;

import java.util.Scanner;

public class StringsConsecutive {

	public static void main(String[] args) {
		
		int number;
		String s[] = new String[20];
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of strings:");
		number=in.nextInt();
		System.out.println("Enter the strings");
		for(int i=0;i<number;i++)
		{
			s[i]=in.next();
		}
		for(int i=0;i<number;i++)
		{
			for(int j=0;j<s[i].length();j++)
			{
				//char ch = s[i].charAt(j);
				if((s[i].charAt(j+1)-s[i].charAt(j))==1)
				{
					System.out.print(s[i].charAt(j)+s[i].charAt(j+1));
				}
			}
			System.out.println();
		}
		
	}

}
