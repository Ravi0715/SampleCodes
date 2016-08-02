package org.tasks;

import java.util.HashSet;
import java.util.Scanner;

public class LongestStringSubSequence {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s1 = in.next();
		HashSet<Character> hashSet = new HashSet<Character>();
		for(int i=0;i<s1.length();i++)
		{
			char ch = s1.charAt(i);
			if(hashSet.contains(ch))
			{
				System.out.print(ch);
			}
			hashSet.add(ch);			
		}
	}

}
