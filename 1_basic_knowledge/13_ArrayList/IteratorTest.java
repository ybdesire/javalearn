import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;


class IteratorTest
{	
	public static void main(String[] args)
	{
		List l = new ArrayList();
		l.add("aaaa");//add(), do not care about item type
		l.add("1234");
		l.add("bbbb");
		l.add("4567");
		
		//access list by iterator
		Iterator it = l.iterator();
		
		while(it.hasNext())//go through ArrayList
		{
			String str = (String)it.next();//必须要做类型转换
			System.out.println(str);
		}
		
		//access list by for-each
		for(Object obj: l)
		{
			String str = (String)obj;
			System.out.println(str);
		}
	}
}