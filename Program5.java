package org.yodleepapers;

public class Program5 implements Runnable{

	public static void main(String[] args) throws InterruptedException {

		Program5 pr5 = new Program5();
		Thread t = new Thread(pr5,"A");
		Thread t1 = new Thread(pr5,"B");
		t.start();
		t.join();
		t1.start();

	}

	@Override
	public void run() {

		try
		{
			for(int i=0;i<4;i++)
			{
				Thread.sleep(100);
				System.out.println(Thread.currentThread().getName());
				
			}
		}
		catch(InterruptedException e)
		{
			
		}
		
	}

}
