import java.util.Scanner;
import java.util.InputMismatchException;

class Div
{
	public static void main(String args[])
	{
		
		
		try
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("input first num:");
			int i1 = scan.nextInt();
			System.out.println("input second num:");
			int i2 = scan.nextInt();
			
			System.out.println(i1 + "/" + i2 + "=" + i1/i2);
		}
		catch(InputMismatchException e)//如果没有输入int值，则发生异常
		{
			System.out.println("Exception: your input should be integer!!!");
		}
		catch(ArithmeticException e)//除数为0，则异常
		{
			System.out.println("Exception: divide number cannot be zero!!!");
		}
		
		
		System.out.println("Program is completed");
	}
}