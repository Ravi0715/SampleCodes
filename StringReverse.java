package org.tasks;

import java.util.Scanner;

public class StringReverse {

	public static void main(String args[]){
		
		String s1;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter String");
		s1=in.next();
		for(int i=s1.length()-1;i>=0;i--)
			System.out.print(s1.charAt(i));
		}
}
