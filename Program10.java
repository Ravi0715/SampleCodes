package org.yodleepapers;

public class Program10 {

	Program10(){
		System.out.println("Hello");
	}
	Program10(String str)
	{
		
		System.out.println("Hi:"+str);
		this();
	}
	public static void main(String[] args) {
		
		new Program10("Kartheek");

	}

}
