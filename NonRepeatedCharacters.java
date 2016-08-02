package org.tasks;


import java.util.Scanner;
import java.util.TreeSet;

public class NonRepeatedCharacters {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string1:");
		String s1 = in.next();
		System.out.println("Enter the string2");
		String s2 = in.next();
		TreeSet<Character> tc = new TreeSet<Character>();
		for(int i=0;i<s1.length();i++)
		{
			char ch = s1.charAt(i);
			tc.add(ch);
		}
		System.out.print("Characters Not present in First String are: ");
		for(int i=0;i<s2.length();i++)
		{
			char ch = s2.charAt(i);
			if(tc.contains(ch))
			{
				continue;
			}
			else
			{
				System.out.print(ch);
			}
		}
	}

}
