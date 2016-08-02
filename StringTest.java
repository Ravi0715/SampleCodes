package org.tests;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import org.comparators.CountComparatorLargestSubStringRepated;
import org.comparators.StringComparator;

public class StringTest {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter string");
		String read = in.next();
		String sub[] = new String[1000];
		int p=0;
		for(int i=0;i<read.length();i++)
			for(int k=1;k<=read.length()-i;k++)
			{
				sub[p]=read.substring(i,i+k);
				p++;
			}
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>(new CountComparatorLargestSubStringRepated());
		for(int i=0;i<p;i++)
		{
			if(tm.containsValue(sub[i]))
				tm.put(2, sub[i]);
			else
				tm.put(1, sub[i]);
		}
		TreeMap<String, Integer> mp = new TreeMap<String, Integer>(new StringComparator());
		Set<Entry<Integer, String>> se =tm.entrySet();
		Iterator<Entry<Integer, String>> ie =se.iterator();
		while(ie.hasNext())
		{
			Entry<Integer, String> ei =ie.next();
			int valueOfmp = ei.getKey();
			String keyOfmp = ei.getValue();
			if(valueOfmp>1)
				mp.put(keyOfmp, valueOfmp);
		}
		System.out.println("Result is:\n"+mp.firstKey());
	}

}
