package practice.tasks;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemovingCommonCharacters {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the no. of strings");
		int n =in.nextInt();
		System.out.println("Enter Strings");
		String str[] = new String[n];
		for(int i=0;i<str.length;i++)
			str[i]=in.next();
		HashSet<Character> hc = new HashSet<Character>();
		int count;
		for(char ch = 'a';ch<='z';ch++)
		{
			count=0;
			int len=str.length;
			while((len--)>0)
			{
				HashSet<Character> hs = new HashSet<Character>();
				int strlen = str[len].length();
				while((strlen--)>0)
				{
					hs.add(str[len].charAt(strlen));
				}
				if(hs.contains(ch)){
					count++;
				}
			}
			if(count==str.length)
				hc.add(ch);
		}
		for(char ch:hc)
		{
			for(int i=0;i<str.length;i++)
			{
				for(int j=0;j<str[i].length();j++)
				{
					str[i]=str[i].replace(ch, ' ');
				}
			}
		}
		for(int i=0;i<str.length;i++)
			System.out.println(str[i]);
	}

}
