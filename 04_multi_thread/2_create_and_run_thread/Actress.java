public class Actress implements Runnable//multi-thread by implements Runnable
{
	public void run()
	{
		System.out.println("thread " + Thread.currentThread().getName());
	}
	
	
	public static void main(String[] args)
	{
		Thread ac = new Thread(new Actress());
		ac.setName("Ms. Thread");
		ac.start();
	}
}