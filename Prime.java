package org.tasks;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
    
        int limit;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the limit");
        limit=in.nextInt();
        int a[] = new int[limit];
        int k=0;
        System.out.println("Enter the nth prime number");
        int number=in.nextInt();
        for(int i=1; i <limit; i++){       
                boolean isPrime = true;
                for(int j=2; j < i ; j++){
                        if(i % j == 0){
                        	
                                isPrime = false;
                                break;
                                                             
                        }
                }
                if(isPrime)
                {
                        
                        a[k]=i;                                                                      
                        k++;
                        
                }
                
        }
        for(int r=0;r<a.length;r++)
        {
        	if(a[r]==0)
        	{
        		break;
        	}
        	if(r==number)
        	{
    		   System.out.println("the "+number+"th prime number is "+a[r]);
        	}
        }
}
}