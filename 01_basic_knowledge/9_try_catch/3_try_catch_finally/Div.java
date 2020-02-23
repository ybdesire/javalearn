import java.util.Scanner;
import java.util.InputMismatchException;

class Div
{
	public double fun()
	{
		try
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("input first num:");
			int i1 = scan.nextInt();
			System.out.println("input second num:");
			int i2 = scan.nextInt();
			
			System.out.println(i1 + "/" + i2 + "=" + i1/i2);
			return i1/i2;
		}
		catch(InputMismatchException e)//如果没有输入int值，则发生异常
		{
			System.out.println("Exception: your input should be integer!!!");
		}
		catch(ArithmeticException e)//除数为0，则异常
		{
			System.out.println("Exception: divide number cannot be zero!!!");
		}
		finally
		{
			System.out.println("Finally");
		}
		
		
		System.out.println("Program is completed");
		return -1f;

	}
	
	public static void main(String args[])
	{
		Div d = new Div();
		System.out.println("result at main = " + d.fun());
	}
}