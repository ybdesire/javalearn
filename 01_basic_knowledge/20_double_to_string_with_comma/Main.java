import java.text.DecimalFormat;

public class Main
{
	public static void main(String arg[])
	{
		double x1 = 12000.3456;
		double x2 = 3400.5;
		double x3 = 660000;
		
		DecimalFormat formatter = new DecimalFormat("#,###.00");
		
		System.out.println( formatter.format(x1) );//12,000.35
		System.out.println( formatter.format(x2) );//3,400.50
		System.out.println( formatter.format(x3) );//660,000.00
	}
}