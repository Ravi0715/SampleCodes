package org.tasks;

import java.util.Scanner;

public class PossibleSubStrings {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string");
		String string=in.next();
		String subString[] = new String[500];
		int count=0;
		for(int i=0;i<string.length();i++)
			for(int j=0;j<string.length();j++)
			{
				if(i>j)
				{
					char ch = string.charAt(i);
					 char c =string.charAt(j);

					 StringBuffer sb=new StringBuffer();
					sb.append(ch);
					sb.append(c);
					String s = sb.toString();
					System.out.println(s);
				}
				subString[count]=string.substring(i, i+j);
				count++;
				
			}
		//System.out.println(string.substring(2, 1));
		/*for(int i=0;i<count;i++)
		{
			System.out.println(subString[i]);
		}
*/
	}

}
