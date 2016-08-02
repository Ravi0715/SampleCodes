package org.Arrays;

import java.util.Scanner;

public class Sample {
	 public void isPrimeNumber(int number){
         boolean b;
	        for(int i=2; i<=number/2; i++){
	            if(number % i == 0){
	            		break;
	            }
	            else
	            	System.out.println(number);
	        }
	        /*b=true;
	        if(true)
	        {
	        	System.out.println(number);
	        }*/
	    }

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n;
		int a[]=new int[10];
		System.out.println("Enter size");
		n=in.nextInt();
		System.out.println("Enter elements");
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		Sample sample = new Sample();
		for(int i=0;i<n;i++)
		{
			sample.isPrimeNumber(a[i]);
		}
	}

}
