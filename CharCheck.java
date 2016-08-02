package org.tasks;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharCheck {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter string");
		String s = in.next();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(hm.containsKey(ch))
			{
				hm.put(ch, hm.get(ch)+1);
			}
			else
			{
				hm.put(ch, 1);
			}
		}
		int val[] = new int[10];
		char key[] = new char[10];
		int p=0;
		for(Map.Entry<Character, Integer> en:hm.entrySet())
		{
			val[p]=en.getValue();
			key[p]=en.getKey();
			p++;
		}
		for(int i=0;i<p;i++)
		{
			for(int j=i+1;j<p;j++)
			{
				if(val[i]==val[j])
				{
					if(key[i]<key[j])
					{
						char temp=key[i];
						key[i]=key[j];
						key[j]=temp;
					}
				}
				if(val[i]<val[j])
				{
					int temp=val[i];
					val[i]=val[j];
					val[j]=temp;
					char temp1=key[i];
					key[i]=key[j];
					key[j]=temp1;
				}
			}
		}
		System.out.println(key[0]+" "+val[0]);
	}

}
