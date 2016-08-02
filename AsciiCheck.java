package org.practice;

import java.util.HashMap;
import java.util.Scanner;

import org.pojos.SortModelClass;

public class AsciiCheck {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = in.next();
		HashMap<Character,Integer> hs = new HashMap<Character, Integer>();
		for(int i=0;i<s.length();i++)
		{
			SortModelClass smc = new SortModelClass();
			if(hs.containsKey(s.charAt(i)))
			{
				smc.setKey(s.charAt(i));
				smc.setValue(hs.get(s.charAt(i))+1);
				hs.put(s.charAt(i),hs.get(s.charAt(i))+1);
			}
			else
			{
				smc.setKey(s.charAt(i));
				smc.setValue(1);
				hs.put(s.charAt(i), 1);
			}
		}
		
	}

}
