
public class ClassDemo
{
	
	public static void main(String[] args)
	{
		Foo f = new Foo();
		
		Class c1 = Foo.class;//任何一个类，都有一个隐含的静态成员变量
		Class c2 = f.getClass();
		
		//c1, c2是Foo类的类类型
		try
		{
			Class c3 = Class.forName("Foo");
			System.out.println(c1==c2 && c2==c3);
		} catch(ClassNotFoundException e)
		{
			
		}
		
		//可以通过该类的类类型，来创建该类的实例(必须有无参数的构造方法)。
		//通过c1, c2, c3创建对象
		try
		{
			Foo f2 = (Foo)c1.newInstance();
		} catch(Exception e)
		{
			
		}
	}
}

class Foo{}//Foo是Class的对象