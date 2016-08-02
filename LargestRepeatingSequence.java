package org.tasks;



import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import org.comparators.CountComparatorLargestSubStringRepated;
import org.comparators.StringComparator;

public class LargestRepeatingSequence {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String str = sc.next();
		String sub[] = new String[1000];
		int p = 0;
		for(int i=0;i<str.length();i++)
			for(int k=1;k<=str.length()-i;k++)
			{
				sub[p]=str.substring(i,i+k);
				p++;
			}
		TreeMap<Integer,String> hmp =  new TreeMap<Integer,String>(new CountComparatorLargestSubStringRepated());
		for(int i=0;i<p;i++)
		{
			String s = sub[i]; 
			System.out.println(s);
			if(hmp.containsValue(s))
				hmp.put(2,s);
			else
				hmp.put(1,s);
		}
		TreeMap<String,Integer> mp =  new TreeMap<String,Integer>(new StringComparator());
		Set<Entry<Integer,String>> st = hmp.entrySet();
		Iterator<Entry<Integer,String>> ie = st.iterator();
		while(ie.hasNext())
		{
			Entry<Integer,String> en = ie.next();
			int valueofmp = en.getKey();
			String keyofmp = en.getValue();
			if(valueofmp>1)
				mp.put(keyofmp,valueofmp);
		}
		System.out.println("Output:-\n"+mp.firstKey());
	}

}
