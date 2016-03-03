import java.util.Scanner;


class InOut
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("input: ");		
		
		String str = input.next();//get input string

		System.out.println("output: "+str);
	}
}