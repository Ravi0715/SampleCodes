package org.tasks;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class OccurencesOfWord {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		//Reading the paragraph
		System.out.println("Enter the paragraph");
		String paragraph=in.nextLine();
		//Split the paragraph into words
		String words[] =paragraph.split(" ");
		Set<String> ss =  new HashSet<String>();
		//Add the items to set
		for(int i=0;i<words.length;i++)
		{
			ss.add(words[i]);
		}
		Iterator<String> iss = ss.iterator();
		System.out.println("No. of words occured in the paragraph are:");
		//Iterate each word
		while(iss.hasNext())
		{
			int count =0;
			String s = iss.next();
			//Increment the counter how many times word occur in the paragraph
			for (int j=0;j<words.length;j++)
			{
				if(s.equalsIgnoreCase(words[j]))
				{
					count++;
				}
			}
			//Display the word and how many times occurred in paragraph
			if(count>0)
			{
				System.out.println(s+" "+count);
			}
		}
		
	}

}
