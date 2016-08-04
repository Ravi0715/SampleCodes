package project.items;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ItemImpl {


	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("D:\\itemset.txt");
		BufferedReader br = new BufferedReader(fr);
		String row;
	
		HashMap<String , Integer> hm = new HashMap<String, Integer>();
		while((row=br.readLine())!=null)
		{
			String data[] =row.split(",");
			if(hm.containsKey(data[2]))
			{
				hm.put(data[2], hm.get(data[2])+1);
			}
			else
			{
				hm.put(data[2], 1);
			}
		}
		int max=0;
		for(Map.Entry<String, Integer> em:hm.entrySet())
		{
			if(em.getValue()>max)
			{
				max=em.getValue();
			}
		}
		for(Map.Entry<String, Integer> em:hm.entrySet())
		{
			if(max==em.getValue())
			{
				System.out.println("Highest Saled Item:"+em.getKey()+" and no of times sold:"+max);
			}
		}
		br.close();
		fr.close();
	}

}
