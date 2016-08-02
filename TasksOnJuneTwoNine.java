package org.tasks;


import java.util.Scanner;

public class TasksOnJuneTwoNine {

	public static void main(String[] args) throws Exception {
		
		
		int n,ch=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the character");
		ch = System.in.read();
		System.out.println("Enter the position");
		n=in.nextInt();
		int c=ch+n;
		System.out.println("The Character is:");
		System.out.println((char)c);
	}

}
