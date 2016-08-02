package org.tasks;

import java.util.List;
import java.util.Scanner;

public class StringSort {

	public static void main(String[] args) {
		
		String s1;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter string");
		s1=in.next();
		char c[] = s1.toCharArray();
		int i=0,j=s1.length()-1;
		char temp;
		while(i<j)
		{
			temp=c[i];
			c[i]=c[j];
			c[j]=temp;
			i++;
			j--;
		}
		i=0;
		while(c[i]!='\0')
			System.out.print(c[i]);
	}

}
