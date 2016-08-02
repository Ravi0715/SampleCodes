package org.tasks;

import java.util.Scanner;

public class VowelConsonantsCount {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of strings");
		int n=scanner.nextInt();
		String s[] = new String[n];
		System.out.println("Enter the strings");
		for(int i=0;i<n;i++)
			s[i]=scanner.next();
		int vowelCount=0,consonantCount=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<s[i].length();j++)
			{
				char ch = s[i].charAt(j);
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				{
					vowelCount++;
				}
				else
				{
					consonantCount++;
				}
				
			}
			if(vowelCount>consonantCount)
			{
				System.out.println(s[i]);
				vowelCount=0;
				consonantCount=0;
			}
		}

	}

}
