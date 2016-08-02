package org.yodleepapers;
abstract class Kartheek
{
	void hello();
}

public class Program11 extends Kartheek{

	public static void main(String[] args) {
		
		new Program11().hello();
		

	}
	void hello()
	{
		System.out.println("Hello:".toUpperCase());
	}
	

}
