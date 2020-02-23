import org.jsoup.nodes.Document;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;


class Basic
{
	public static void main(String[] args)
	{
		try
		{
			Document doc = Jsoup.connect("http://en.wikipedia.org/").get();
		}
		catch(Exception e)
		{
			
		}

		System.out.println("axgsdf");
	}
}