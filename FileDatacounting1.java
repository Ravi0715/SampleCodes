import java.io.*;
import java.lang.*;
import java.util.*;
class FileDatacounting1 
{
	public static void main(String args[]) throws IOException
	{
	 Counter word= new Counter("word");
	 word.start();
	 Counter line= new Counter("line");
	 line.start();
	 Counter ch= new Counter("ch");
	 ch.start();
	}
}
class Counter extends Thread
{
	 String select;
	 public Counter(String select)
	 {
			
			this.select=select; 
			
	 }
	 synchronized public void run()
	 {
		 try
		 {
				
				String inputFile="D:\\aaa\\one.txt";
				File file = new File(inputFile);
            Scanner in = new Scanner(file);
			Scanner in1 = new Scanner(file);
			

            int words = 0;
            int lines = 0;
            int chars = 0;

            while(in.hasNext())
            {
					String s = in.next();
                words++;
				for(int i=0;i<s.length();i++)
					chars++;
            }

            while(in1.hasNextLine())
            {
                
				in1.nextLine();
				lines++;
                
            }

           
				if(select.equalsIgnoreCase("line"))
					System.out.println("No.of lines="+lines);
				else if(select.equalsIgnoreCase("word"))
					System.out.println("No.of words="+words);
				else 
					System.out.println("No.of characters"+chars); 
			
		 }
		 catch(Exception e)
		 {
		  e.printStackTrace();
		 }
	 } 
}