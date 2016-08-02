package org.tasks;

import java.util.Scanner;

public class StringsExmpl {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string");
		String s=in.next();
		char c[] =s.toCharArray();
		StringBuffer even = new StringBuffer();
		StringBuffer odd = new StringBuffer();
		for(int i=0;i<c.length;i++)
		{
			if(i%2==0)
			{
				even.append(c[i]);
			}
			else
			{
				odd.append(c[i]);
			}
		}
		
		System.out.println(even+" "+odd);
	}

}
