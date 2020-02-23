public class Main
{
	public static void main(String arg[])
	{
		double x1 = 12.3456;
		double x2 = 34.5;
		double x3 = 66;
		System.out.println( String.format("%.2f", x1) );//12.35
		System.out.println( String.format("%.2f", x2) );//34.50
		System.out.println( String.format("%.2f", x3) );//66.00
	}
}