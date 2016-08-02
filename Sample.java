class Sample
{
	String sName,sId;//properties
	public void display()//methods
	{
		sName="Phani";
		sId="545";
		//System.out.println("Student Name:"+sName+"sId:"+sId);
	}
	public static void main(String args[])
	{
		Sample sample = new Sample();//object creation
		sample.display();
		System.out.println(sample.sName);
	}
}