package org.tasks;

import java.util.HashMap;
import java.util.Scanner;

public class AnagramProg {

	static void isAnagram(String s1,String s2)
	{
		String c1=s1.replaceAll("\\s","").toLowerCase();
		String c2=s2.replaceAll("\\s","").toLowerCase();
		boolean check=true;
		if(c1.length()!=c2.length())
			check= false;
		else
		{
			HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
			for(int i=0;i<c1.length();i++)
			{
				char ch =c1.charAt(i);
				int count=0;
				if(hm.containsKey(ch))
				{
					count=hm.get(ch);
				}
				hm.put(ch, ++count);
				ch=c2.charAt(i);
				count=0;
				if(hm.containsKey(ch))
				{
					count=hm.get(ch);
				}
				hm.put(ch, --count);
			}
			for(int val:hm.values())
			{
				if(val!=0)
					check=false;
			}
			if(check)
				System.out.println(s1+" and "+s2+" are anagrams");
			else
				System.out.println(s1+" and "+s2+" are not anagrams");
		}
	}
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter String 1:");
		String str1=in.nextLine();
		System.out.println("Enter String 2");
		String str2=in.nextLine();
		isAnagram(str1, str2);

	}

}
