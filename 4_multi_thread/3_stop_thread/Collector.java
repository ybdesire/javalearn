// never use stop() to stop thread
// the correct method to stop thread: by flag

class Collector extends Thread
{
	volatile boolean keepRunning = true;//the flag to stop thread
	
	public void run()
	{
		int count = 0;
		while(keepRunning)
		{
			System.out.println(count++);
		}
		System.out.println("collect garbage ... completed");
	}
	
	public static void main(String[] args)
	{
		Collector t1 = new Collector();
		t1.start();
		try
		{
			Thread.sleep(2000);
		} catch(Exception e)
		{}
		t1.keepRunning = false;
	}
}