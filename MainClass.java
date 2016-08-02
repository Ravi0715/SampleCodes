package org.Arrays;

import java.util.Scanner;

public class MainClass
{
    public void sumOfAllDigits(int inputNumber)
    {
        int copyOfInputNumber = inputNumber;
        int sum = 0;
        while (copyOfInputNumber != 0)
        {
            int lastDigit = copyOfInputNumber%10;
            sum = sum + lastDigit;
            copyOfInputNumber = copyOfInputNumber/10;
        }
        boolean b=isPrime(sum);
        if(b)
        {
        	System.out.println(inputNumber);
        }
    }
    public boolean isPrime(int number)
	{
		for(int i=2;i<number/2;i++)
		{
			if(number%i==0)
			{
				return false;
			}
		}
		return true;
	}
    public static void main(String[] args)
    {
    	MainClass mc = new MainClass();
    	Scanner in = new Scanner(System.in);
    	int a[]=new int[20];
		int n;
		System.out.println("Enter size");
		n=in.nextInt();
		System.out.println("Enter elements");
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		System.out.println("The number whose sum of digits are prime numbers are:");
		for(int i=0;i<n;i++)
		{
			mc.sumOfAllDigits(a[i]);
		}
    }
}