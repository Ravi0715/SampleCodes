package org.tasks;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;


public class SetOfCharacters {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = in.nextLine();
		HashMap<Character, HashSet<Integer>> hm = new HashMap<Character, HashSet<Integer>>();
		for(int i=0;i<s.length();i++)
		{
			HashSet<Integer> hs = new HashSet<Integer>();
			if(s.charAt(i)==' ')
			{
				continue;
			}
			if(hm.containsKey(s.charAt(i)))
			{
				hs = hm.get(s.charAt(i));
				hs.add(i);
				hm.put(s.charAt(i), hs);
			}
			else
			{
				hs.add(i);
				hm.put(s.charAt(i), hs);
			}
		}
		System.out.println(hm);

	}

}
