package practice.ravi;

import java.io.IOException;
import java.io.StringReader;
import java.util.Scanner;

public class StringReaderSampleTask1 {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string");
		String s=in.nextLine();
		StringReader sr = new StringReader(s);
		char buf[] = new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
			char ch =s.charAt(i);
			if(ch=='.')
			{
				sr.read(buf, 0, i);
			}	
		}
		System.out.println(buf);
		
	}

}
