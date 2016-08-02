package org.tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.comparators.DigitComparator;
import org.pojos.Highest;

public class HighestNumber {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = in.nextInt();
		int a=0;
		List<Integer> list = new ArrayList<Integer>();
		while(number!=0)
		{
			a=number%10;
			number=number/10;
			list.add(a);
		}
		Collections.sort(list);
		Iterator<Integer> ii =list.iterator();
		List<Highest> lh = new ArrayList<Highest>();
		while(ii.hasNext())
		{
			int x=ii.next();
			Highest high = new Highest();
			high.setDigit(x);
			lh.add(high);
		}
		Collections.sort(lh, new DigitComparator());
		Iterator<Highest> ih =lh.iterator();
		while(ih.hasNext())
		{
			Highest h =ih.next();
			System.out.print(h.getDigit());
		}
	}

}
