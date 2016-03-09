// input "World" to new World object statically ($ java Office World)
// input "Excel" to new Excel object dynamically($ java Office Excel)

public class Office
{
	public static void main(String[] args)
	{
		if("World".equals(args[0]))
		{
			World w = new World();// static load 
			System.out.println(w.getClass()+" start");
		}
		else
		{
			try
			{
				Class c = Class.forName(args[0]);// dynamic load 
				Object o = (Object)c.newInstance();// dynamic new instance
				System.out.println(o.getClass()+" start");
			} catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}

class World{}

class Excel{}