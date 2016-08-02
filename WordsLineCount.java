package org.tasks;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WordsLineCount {

	public static void main(String[] args) {
		
		Counter c = new Counter();
		Thread t = new Thread(c);
		t.start();

	}

}
class Counter implements Runnable
{
	public void run()
	{
		try {
			FileReader fr = new FileReader("D:\\aaa\\one.txt");
			BufferedReader br = new BufferedReader(fr);
			String line;
			int count=0,wordCount=0,lineCount=0,charCount=0;
			try {
				while((line=br.readLine())!=null)
				{
					String arr[] = line.split(" ");
					wordCount+=arr.length;
					for(int i=0;i<arr.length;i++)
						charCount+=arr[i].length();
					count++;
					if(count<arr.length)
					{
						++lineCount;
						count=0;
					}
				}
				System.out.println("Word Count:"+wordCount);
				System.out.println("Line Count:"+lineCount);
				System.out.println("Characters:"+charCount);
			} catch (IOException e) {
			
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}
}
