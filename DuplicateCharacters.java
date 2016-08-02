package org.tasks;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateCharacters {

	public static void main(String[] args) {

		String s1,s2;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the strings");
		s1=in.next();
		s2=in.next();
		Set<Character> sc = new HashSet<Character>();
		for(int i=0;i<s1.length();i++)
		{
			char ch = s1.charAt(i);
			for(int j=0;j<s2.length();j++)
			{
				char ch1 = s2.charAt(j);
				if(ch==ch1)
					sc.add(ch);
			}
		}
		System.out.println(sc);
	}

}
