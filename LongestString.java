package org.tasks;


import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class LongestString {

	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter No. Of String");
		int n=in.nextInt();
		Hashtable<String, Integer> ht = new Hashtable<String, Integer>();
		System.out.println("Enter Strings");
		for(int i=0;i<n;i++)
		{
			String s=new String();
			s=in.next();
			ht.put(s, s.length());
		}
		int pos=0;
		Set<Entry<String, Integer>> se= ht.entrySet();
		Iterator<Entry<String, Integer>> ie =se.iterator();
		int i=0;
		while(ie.hasNext())
		{
			Entry<String, Integer> es=ie.next();
			if(es.getValue()>pos)
				pos=es.getValue();
		}
		Iterator<Entry<String, Integer>> ies =se.iterator();
		while(ies.hasNext())
		{
			Entry<String,Integer> es = ies.next();	
			if(es.getValue()==pos)
				System.out.println(es.getKey());
		}
		
	}
}
