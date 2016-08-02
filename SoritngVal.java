package org.tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SoritngVal {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = in.nextInt();
		System.out.println("Enter array elements");
		List<Integer> li = new ArrayList<Integer>();
		for(int i=0;i<n;i++)
			li.add(in.nextInt());
		Collections.sort(li);
		Object oo [] =li.toArray();
		for(int i=0;i<oo.length;i++)
			System.out.print(oo[i]+" ");
		
	}

}
