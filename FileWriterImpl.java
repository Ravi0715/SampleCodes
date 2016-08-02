package practice.tasks;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class FileWriterImpl {

	public static void main(String[] args) throws IOException {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter no. of students:");
		int n=in.nextInt();
		System.out.println("Enter Student id's and marks and cgpa");
		int a[] = new int[10];
		int m[] = new int[10];
		int cgpa[] =new int[10];
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
			m[i]=in.nextInt();
			cgpa[i]=in.nextInt();
		}
		FileWriter fw = new FileWriter("D:\\aaa\\smpl.txt",true);
		BufferedWriter bw = new BufferedWriter(fw);
		for(int i=0;i<n;i++)
		{
			bw.write(a[i]+","+m[i]+","+cgpa[i]);
			bw.newLine();
		}
		System.out.println("Stored...");
		
		bw.close();
		fw.close();
	}

}
