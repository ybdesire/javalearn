class Test
{
	public void fun() throws DrunkException
	{
		throw new DrunkException("this is trunk exception");
	}
	
	public static void main(String args[])
	{
		try
		{
			Test t = new Test();
			t.fun();
		}
		catch(DrunkException e)
		{
			e.printStackTrace();
		}
	}
}