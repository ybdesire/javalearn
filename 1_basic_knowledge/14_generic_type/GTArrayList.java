import java.util.List;
import java.util.ArrayList;

class GTArrayList
{
	public static void main(String[] args)
	{
		List<Integer> li = new ArrayList<Integer>();//generic
		li.add(3);//correct
		li.add('a');//incorrect
		
		List l = new ArrayList();//non-generic
		l.add(3);//correct:    any type of item can be added to l
		l.add('a');//correct:    any type of item can be added to l
	}
}