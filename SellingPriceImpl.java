package project.items;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class SellingPriceImpl {


	public static void main(String[] args) throws IOException {
	
		FileReader fr = new FileReader("D:\\itemset.txt");
		BufferedReader br = new BufferedReader(fr);
		String row;
		HashMap<String, Double> hm = new HashMap<String, Double>();
		while((row=br.readLine())!=null)
		{
			String data[] =row.split(",");
			if(hm.containsKey(data[2]))
			{
				hm.put(data[2], hm.get(data[2])+Double.parseDouble(data[3]));
			}
			else
			{
				hm.put(data[2], Double.parseDouble(data[3]));
			}
		}
		double max=0.0;
		for(Map.Entry<String, Double> em:hm.entrySet())
		{
			if(em.getValue()>max)
			{
				max=em.getValue();
			}
		}
		for(Map.Entry<String, Double> em:hm.entrySet())
		{
			if(max==em.getValue())
			{
				System.out.println("Highest Saled Item:"+em.getKey()+" and price is:"+max);
			}
		}
		br.close();
		fr.close();
		
	}

}
