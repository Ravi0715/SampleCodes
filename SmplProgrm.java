package org.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SmplProgrm {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size:");
		int n=in.nextInt();
		Integer a[]=new Integer[n];
		System.out.println("Enter elements");
		for(int i=0;i<a.length;i++)
			a[i]=in.nextInt();
		List<Integer> ai=Arrays.asList(a);
		System.out.println(ai);

	}

}
