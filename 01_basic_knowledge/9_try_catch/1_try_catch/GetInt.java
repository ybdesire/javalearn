import java.util.Scanner;
import java.util.InputMismatchException;

class GetInt
{
	public static void main(String args[])
	{
		System.out.println("input your age:");
		
		try
		{
			Scanner scan = new Scanner(System.in);
			int age = scan.nextInt();
			System.out.println("Your age is: " + age);
		}
		catch(InputMismatchException e)//���û������intֵ�������쳣
		{
			System.out.println("Exception: your input should be integer!!!");
			e.printStackTrace();//print exception
		}
		
		
		System.out.println("Program is completed");
	}
}