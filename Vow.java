package org.Test;

import java.util.Scanner;

public class Vow {

	public static void main(String[] args) {
		System.out.println("Enter the String");
		@SuppressWarnings("resource")
		Scanner r = new Scanner(System.in);
		String string = r.next();
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				System.out.println("The Vowels is "+ch);
			}
			else
			{
				System.out.println("The Consants is "+ch);
			}
		}
	}

}
