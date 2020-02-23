class IntStr
{
	public static void main(String[] args)
	{
		int i = 6;
		String str = "123";
		//int to string
		String str1 = String.valueOf(i);
		String str2 = Integer.toString(i);
		
		//string to int
		int i1 = Integer.parseInt(str);
		int i2 = Integer.valueOf(str);
		
	}
}