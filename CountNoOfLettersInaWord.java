package org.word;

import java.util.Scanner;

public class CountNoOfLettersInaWord {

		@SuppressWarnings("resource")
		public static void main(String args[]) {
			
			String string;
			int count = 0;
			Scanner in = new Scanner(System.in);
			System.out.println("Enter the String");
			string = in.next();
			String string2[] =  new String[10];
			for (int i = 0; i < string.length(); i++) {
				string2[i] = in.next();
				if(string2[i].equals(string.charAt(i)))
				{
					count++;	
					System.out.println("The Frequencies of "+string2[i]+" is "+count);	
				}
			}
		}
}
