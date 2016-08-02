package org.tasks;

import java.util.Scanner;

public class EvenDeletionInString {

	public static void main(String[] args) {
		
		String s1;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter String");
		s1=in.next();
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			char c= (i%2==0)?ch=' ':ch;
				System.out.print(c);
		}

	}

}
