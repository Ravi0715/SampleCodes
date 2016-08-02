package org.tasks;


import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class NearestVowel {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter Character:");
		char c =in.next().charAt(0);
		char c1=c;
		c=Character.toLowerCase(c);
		if(!((c>='a')&&(c<='z')))
		{
			System.out.println("Please Enter the character between A to Z");
			System.exit(0);		
		}
		TreeMap<Character, Integer> tm = new TreeMap<Character, Integer>();
		TreeSet<Integer> ts = new TreeSet<Integer>();
		String vowel ="aeiou";
		for(int i=0;i<vowel.length();i++)
		{
			if(vowel.charAt(i)>c)
			{
				ts.add(vowel.charAt(i)-c);
				tm.put(vowel.charAt(i),vowel.charAt(i)-c);
			}
			
			else
			{
				if(c>'x')
				{
					ts.add(26-(c-vowel.charAt(i)));
					tm.put(vowel.charAt(i), 26-(c-vowel.charAt(i)));
				}
				else if(c=='x')
				{
					if(c-vowel.charAt(i)==3)
					{
						ts.add(c-vowel.charAt(i));
						tm.put(vowel.charAt(i), c-vowel.charAt(i));
					}
					else
					{
						ts.add(26-(c-vowel.charAt(i)));
						tm.put(vowel.charAt(i), 26-(c-vowel.charAt(i)));
					}
				}
				else
				{
					ts.add(c-vowel.charAt(i));
					tm.put(vowel.charAt(i), c-vowel.charAt(i));
				}
			}
		}
		//System.out.println(tm);
		int min=ts.first();
		System.out.print("The nearest vowel is:");
		
		for(Map.Entry<Character,Integer> en:tm.entrySet())
		{
			if(min==en.getValue())
			{
				if(Character.isUpperCase(c1))
				{
					System.out.print(Character.toUpperCase(en.getKey())+" ");
				}
				else
				{
					System.out.print(Character.toLowerCase(en.getKey())+" ");
				}
			}
		}
		
	}

}
