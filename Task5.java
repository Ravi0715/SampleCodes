package org.tasks;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string:");
		String s = in.nextLine();
		String arr[] = s.split(" ");
		int maxVow=0;
		String ls=null;
		for(String s1:arr)
		{
			int vow=0;
			for(char ch:s1.toCharArray())
			{
				char c=Character.toLowerCase(ch);
				if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
					vow++;
			}
			if(vow>maxVow)
			{
				maxVow=vow;
				ls=s1;
			}
		}
		System.out.println("String which has maximum vowels are:"+ls+"\nNo. of vowels are:"+maxVow);
		
	}

}
