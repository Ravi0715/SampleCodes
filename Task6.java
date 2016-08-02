package org.tasks;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string");
		String s=in.nextLine();
		char ch[] = s.toCharArray();
		ch[0]-=32;
		System.out.print(ch[0]);
		for(int i=1;i<ch.length;i++)
		{
			if(ch[i-1]==' ')
			{
				ch[i]-=32;
			}
			System.out.print(ch[i]);
		}
	}

}
