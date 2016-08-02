package org.tasks;


import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string");
		String s=in.nextLine();
		int max=0;
		String ar[] = s.split(" ");
		for(int j=0;j<ar.length;j++)
		{
			if(ar[j].length()>max)
				max=ar[j].length();	
		}
		for(int j=0;j<ar.length;j++)
		{
			if(max==ar[j].length())
			{
				System.out.println(ar[j]);
			}
		}		
	}
}
