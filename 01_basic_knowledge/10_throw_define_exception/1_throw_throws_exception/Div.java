import java.util.Scanner;

class Div
{
	private void divide(double x1, double x2) throws Exception
	{
		if(x2==0)
		{
			throw new Exception("second num cannot be zero");
		}
		else
		{
			System.out.println("result is : " + x1/x2);
		}
	}
	
	public void compute_handle_exception()
	{
		try
		{
			divide(1, 0);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String args[])
	{
		Div d = new Div();
		d.compute_handle_exception();
	}
}