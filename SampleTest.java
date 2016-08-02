package org.tests;

import java.util.Scanner;

public class SampleTest {

	private static String getLongestSubString(String str) {

		String curSubStr = "";

		String LongestSubStr = "";

		for (int i = 0; i < str.length(); i++) 
		{
			char c = str.charAt(i);
	
			if (curSubStr.indexOf(c) == -1) 
			{
				curSubStr += c;
				continue;
			} 
			else 
			{
				if(curSubStr.length()> LongestSubStr.length())
					LongestSubStr = curSubStr;
				curSubStr = curSubStr.substring(curSubStr.indexOf(c) + 1) +c;
			}
		}
		if(curSubStr.length() > LongestSubStr.length())
			LongestSubStr = curSubStr;
		return LongestSubStr;

		}
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = in.next();
		System.out.println(getLongestSubString(s));
		

	}

}
