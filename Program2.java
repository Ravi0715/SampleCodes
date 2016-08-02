package org.yodleepapers;

public interface InfA
{
	protected String getName();
}
public class Program2 implements InfA{

	public String getName()
	{
		return "test-name";
	}
	public static void main(String[] args) {
		
		Program2 pr2 =new Program2();
		System.out.println(pr2.getName());

	}

}
