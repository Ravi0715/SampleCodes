package practice.tasks;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SameCharacters {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size:");
		int n=in.nextInt();
		Set<Character> sc = new HashSet<Character>();
		String str[] = new String[n];
		for(int i=0;i<str.length;i++)
		{
			System.out.print("Enter String  "+(i+1)+" : ");
			str[i]=in.next();
		}
		for(int i=0;i<str[0].length();i++)
			sc.add(str[0].charAt(i));

		Set<Character> scc = new TreeSet<Character>();

		Iterator<Character> ic =sc.iterator();
		while(ic.hasNext())
		{
			char ch=ic.next();
			boolean b=true;
			for(int i=1;i<str.length;i++)
			{
				if(str[i].contains(Character.toString(ch)))
					continue;
				else
					b=false;
			}
			if(b)
				scc.add(ch);
		}
		System.out.println("Common Characters in the array: "+scc);
	}

}
