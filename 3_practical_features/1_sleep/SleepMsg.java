public class SleepMsg
{
	public static void main(String[] args)
	{
		for(int i=0;i<10;i++)
		{
			try
			{
				Thread.sleep(1000);//sleep for 1 second
				System.out.println("sleep: " + i);
			} catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}