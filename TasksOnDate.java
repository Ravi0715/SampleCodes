package org.tasks;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.comparators.HighestTemparatureComparator;
import org.comparators.LowesttTemparatureComparator;

public class TasksOnDate {

	public static void main(String[] args) throws Exception {
		
		Scanner in = new Scanner(System.in);
		int ch;
		FileReader fr = new FileReader("D:\\employee\\data.txt");
		BufferedReader br = new BufferedReader(fr);
		String line;
		List<DateModelClass> ld = new ArrayList<DateModelClass>();
		while((line=br.readLine())!=null)
		{
			String arr[] = line.split(",");
			DateModelClass dateModelClass = new DateModelClass();
			dateModelClass.setDate(arr[0]);
			dateModelClass.setCity(arr[1]);
			dateModelClass.setTemp(Integer.parseInt(arr[2]));
			ld.add(dateModelClass);
		}
		System.out.println("Enter the choice\n1.Find the temperature of banglore on 9th november");
		System.out.println("2.Find the top 5 hottest cities ");
		System.out.println("3.Find the top 5 coldest cities ");
		ch = in.nextInt();
		switch(ch)
		{
			case 1:
				Iterator<DateModelClass> idm =ld.iterator();
				while(idm.hasNext())
				{
					DateModelClass dmc = idm.next();
					if(dmc.getCity().equalsIgnoreCase("bangalore")&&dmc.getDate().equalsIgnoreCase("09-11-2015"))
					{
						System.out.println("Temparature in the "+dmc.getCity()+" on "+dmc.getDate()+" is "+dmc.getTemp());
					}
				}
				break;
			case 2:
				Collections.sort(ld, new HighestTemparatureComparator());
				Iterator<DateModelClass> idm1 =ld.iterator();
				int count = 0;
				System.out.println("Cities with highest temparature");
				while(idm1.hasNext())
				{
					DateModelClass dd = idm1.next();
					count++;
					if(count>5)
						break;
					System.out.println(dd.getCity()+" "+dd.getTemp()+" "+dd.getDate());
				}		
				break;
			case 3:
				Collections.sort(ld, new LowesttTemparatureComparator());
				Iterator<DateModelClass> idm2 =ld.iterator();
				int count1 = 0;
				System.out.println("Cities with lowest temparature");
				while(idm2.hasNext())
				{
					DateModelClass dd = idm2.next();
					count1++;
					if(count1>5)
						break;
					System.out.println(dd.getCity()+" "+dd.getTemp()+" "+dd.getDate());
				}		
				break;
			default:
				System.out.println("Invalid Choice...");
		}
		br.close();
		fr.close();
		in.close();
	}

}
