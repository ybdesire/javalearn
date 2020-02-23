import java.util.ArrayList;
import java.util.List;


class Basic
{
	public static void main(String args[])
	{
		List<String> l = new ArrayList<String>();
		l.add("1234");
		l.add("2234");
		l.add("3234");
		l.add("4234");
		
		if(l.contains("3234"))
		{
			System.out.println("list is list");
		}
		
	}
}