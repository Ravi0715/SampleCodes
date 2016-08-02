package org.tasks;

import java.util.Scanner;

public class StringReverseCheck {

	public static void main(String[] args) {
			
		String s1;
		Scanner in =new Scanner(System.in);
		System.out.println("Enter string");
		s1=in.next();
		byte b[] = s1.getBytes();
		byte temp;
		int j=0;
		
		for(int c=0;c<b.length;c++)
		{
			for(j=0;j<b.length;j++)
			{
				if(b[c]<b[j])
				{
					temp=b[c];
					b[c]=b[j];
					b[j]=temp;
				}
			}
		}
		StringBuffer sb = new StringBuffer();
		for(int k=0;k<b.length;k++)
			sb.append((char)b[k]);
		System.out.println(sb.toString());

	}

}
