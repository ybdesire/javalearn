import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;


class ModifyTest
{	
	public static void main(String[] args)
	{
		List l = new ArrayList();
		l.add("aaaa");//add(), do not care about item type
		l.add("1234");
		l.add("bbbb");
		l.add("4567");
		
		//modify item
		l.set(0, "0");
		l.set(2, "0");
		
		//access list by iterator
		Iterator it = l.iterator();
		
		while(it.hasNext())//go through ArrayList
		{
			String str = (String)it.next();//type cast
			System.out.println(str);
		}
		
	}
}