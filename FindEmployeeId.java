package org.tasks;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FindEmployeeId {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("D:\\aaa\\employee.txt");
		BufferedReader br = new BufferedReader(fr);
		String line;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter details");
		
		String eId = in.next();
		int count=0;
		while((line=br.readLine())!=null)
		{
			String arr[] = line.split(",");
			if(eId.equalsIgnoreCase(arr[0]))
			{
				double bal = Double.parseDouble(arr[4])+Double.parseDouble(arr[5])+Double.parseDouble(arr[6]);
				System.out.println(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+bal+" "+arr[7]);
				count++;
				break;
			}
			else
			{
				count=0;
			}
		}
		if(count==0)
		{
			try {
				throw new EmployeeNotFound("EmployeeNotFoundException");
			} catch (EmployeeNotFound e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
