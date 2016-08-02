package org.tasks;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;


public class FrequencyCharacter {

	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = in.next();
		HashMap<Character, Integer> hs = new HashMap<Character, Integer>();
		for(int i=0;i<s.length();i++)
		{
			if(hs.containsKey(s.charAt(i)))
			{
				hs.put(s.charAt(i),hs.get(s.charAt(i))+1);
			}
			else
			{
				hs.put(s.charAt(i), 1);
			}
		}
		//System.out.println(hs);
		Set<Entry<Character,Integer>> se = hs.entrySet();
		Iterator<Entry<Character, Integer>> ie =se.iterator();
		while(ie.hasNext())
		{
			Entry<Character, Integer> ei =ie.next();
			System.out.print(ei.getKey()+""+ei.getValue());
		}
	}
}
