package org.sampletasks;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class OccuerenceOfWord {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		String w[] = s.split(" ");
		Set<String> ss = new HashSet<String>();
		for(int i=0;i<w.length;i++)
		{
			ss.add(w[i]);
		}
		HashMap<String, Integer> hsi = new HashMap<String, Integer>();
		Iterator<String> is =ss.iterator();
		while(is.hasNext())
		{
			String s1 =is.next();
			int count=0;
			for(int i=0;i<w.length;i++)
			{
				if(s1.equals(w[i]))
				{
					count++;
				}
				hsi.put(s1, count);
			}
		}
		Set<Entry<String, Integer>> sesi=hsi.entrySet();
		Iterator<Entry<String, Integer>> iesi =sesi.iterator();
		while(iesi.hasNext())
		{
			Entry<String, Integer> esi =iesi.next();
			System.out.println(esi.getKey()+" "+esi.getValue());
		}
	}

}
