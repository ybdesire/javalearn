import java.util.concurrent.ThreadLocalRandom;

public class NonSync
{
	public static void main(String[] args)
	{
		MyThread myth = new MyThread();//single object, multi-thread. 
		for(int i=0;i<20;i++)
		{
			Thread t = new Thread(myth);
			t.start();
		}
	}
}

class MyThread implements Runnable
{
	private Data d = new Data();
	public void run()
	{
		for(int i=0;i<10;i++)
		{	
			//synchronized(d)
			{
				if(d.data>0)
				{
					d.data--;
					try{Thread.sleep(1000);}catch(Exception e){}
					d.printData();
				}		
			}
		}
	}
}

class Data
{
	public int data = 5;
		
	public void printData()
	{
		System.out.println("data is " + data);
	}
}