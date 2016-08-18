package practice.tasks;


import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeMap;

public class Task2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		TreeMap<StringCk, String> tm = new TreeMap<StringCk, String>(new ArrangeComparator());
		System.out.println("Enter the no. of strings:");
		int size=in.nextInt();
		String str[]= new String[size];
		System.out.println("Enter the strings:");
		for(int i=0;i<size;i++)
			str[i]=in.next();
		for(int i=0;i<str.length;i++)
		{
			int asciiCount=0;int charCount=0;
			StringCk sck = new StringCk();
			HashSet<Character> hs = new HashSet<Character>();
			for(int j=0;j<str[i].length();j++)
			{
				asciiCount+=str[i].charAt(j);
				if(hs.contains(str[i].charAt(j)))
					charCount++;
				else
					hs.add(str[i].charAt(j));
			}
			charCount=charCount>=1?charCount+1:charCount;
			//System.out.println(str[i]+" "+asciiCount+" "+charCount);
			sck.setAsciiCount(asciiCount);
			sck.setCharCount(charCount);
			tm.put(sck, str[i]);
		}
		//System.out.println(tm);
		System.out.println("Strings after order:");
		for(String s:tm.values())
			System.out.println(s);
	}

}
