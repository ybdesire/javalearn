
public class ClassDemo
{
	
	public static void main(String[] args)
	{
		Foo f = new Foo();
		
		Class c1 = Foo.class;//�κ�һ���࣬����һ�������ľ�̬��Ա����
		Class c2 = f.getClass();
		
		//c1, c2��Foo���������
		try
		{
			Class c3 = Class.forName("Foo");
			System.out.println(c1==c2 && c2==c3);
		} catch(ClassNotFoundException e)
		{
			
		}
		
		//����ͨ������������ͣ������������ʵ��(�������޲����Ĺ��췽��)��
		//ͨ��c1, c2, c3��������
		try
		{
			Foo f2 = (Foo)c1.newInstance();
		} catch(Exception e)
		{
			
		}
	}
}

class Foo{}//Foo��Class�Ķ���