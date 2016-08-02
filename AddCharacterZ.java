package org.tasks;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class AddCharacterZ {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = in.nextLine();
		String arr[] =s.split(" ");
		HashMap<Integer , String> hs =  new HashMap<Integer, String>();
		for(int i=0;i<arr.length;i++)
		{
			hs.put(i, arr[i]);
		}
		Collection<String> cc =hs.values();
		Iterator<String> is  =cc.iterator();
		StringBuffer sb = null;
		while(is.hasNext())
		{
			String sq = is.next();
			if(sq.endsWith("e"))
			{
				for(int i=0;i<sq.length();i++)
				{
					char ch = sq.charAt(i);
					if(ch=='e'&&(sq.length()-i==1))
					{
						sb = new StringBuffer();
						sb.append("Z"+ch);
					}
					else
					{
						sb = new StringBuffer();
						sb.append(ch);
					}
					System.out.print(sb.toString());
				}
			}
			else
			{
				System.out.print(sq);
			}
			System.out.print(" ");
		}
	}

}
