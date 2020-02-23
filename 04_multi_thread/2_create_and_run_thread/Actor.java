public class Actor extends Thread//multi-thread by extends Thread
{
	public void run()
	{
		System.out.println("thread " + getName());
	}
	
	
	public static void main(String[] args)
	{
		Thread ac = new Actor();
		ac.setName("Mr. Thread");
		ac.start();
	}
}