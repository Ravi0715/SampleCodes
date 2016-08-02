package org.tasks;


import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import org.comparators.CountComparatorLargestSubStringRepated;


public class NoCharacterOneAfterEachOther {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("enter the string");
		String s=in.next();
		TreeMap<Integer, Character> tm = new TreeMap<Integer, Character>(new CountComparatorLargestSubStringRepated());
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(tm.containsValue(ch))
			{
				tm.put(i+1,ch);
			}
			else
			{
				tm.put(1, ch);
			}
		}
		System.out.println(tm);
		Set<Entry<Integer, Character>> se =tm.entrySet();
		Iterator<Entry<Integer, Character>> ie =se.iterator();
		while(ie.hasNext())
		{
			Entry<Integer, Character> ec =ie.next();
			if(ec.getKey()==1)
			{
				System.out.print(ec.getValue());				
			}
			
		}
	}

}
