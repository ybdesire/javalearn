class hello extends Thread
{
	public hello(int x)
	{
		this.num = x;
	}
	public void run()
	{
		System.out.println("this is thread " + this.num);
	}
	
	public static void main(String[] args)
	{
		hello h1 = new hello(1);
		hello h2 = new hello(2);
		
		h1.start();
		h2.start();
	}
	
	private int num;
}