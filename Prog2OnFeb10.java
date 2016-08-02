package org.Arrays;

import java.util.Scanner;

public class Prog2OnFeb10 {

	public static void main(String[] args) {
		int n;
		char a[]=new char[20];
		String string = new String();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Array Elements");
		string=in.next();
			a=string.toCharArray();
		int count = 1;
		for(int i=0;i<a.length;i++)
		{
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						count++;
					}
				}
				if(count>1)
				{
					System.out.println(a[i]);
				}
		}
		
	}

}
