import java.lang.reflect.Method;


class getAllClassInfo
{
	
	//get class name, variable and function 
	public static void printClassInfo(Object obj)
	{
		Class c = obj.getClass();//get class type
		System.out.println(c.getName());// get class name
		Method[] ms1 = c.getMethods();//get all public member-functions, including inherited
		Method[] ms2 = c.getDeclaredMethods();//get all public member-functions, not including inherited
		for(int i=0; i<ms1.length; i++)
		{
			Class returnType = ms1[i].getReturnType();//get function return type (class type)
			System.out.print(returnType.getName() + " ");
			
			System.out.print(ms1[i].getName() + "( ");//get function name
			
			Class[] paramTypes = ms1[i].getParameterTypes();//get parameter type (class type)
			for(Class t:paramTypes)
			{
				System.out.print(t.getName() + ", ");
			}
			
			
			System.out.println(" )");
		}
		
	}
	
	
	public static void main(String[] args)
	{
		A a = new A();
		B b = new B();
		
		printClassInfo(a);
		printClassInfo(b);
	}
}

class A{
	public void pub_fun_a(int x, Double y){}
	private void pri_fun_a(){}
}

class B extends A
{
	public String pub_fun_b(Integer c){return "";}
	private void pri_fun_b(){}
}