import org.jsoup.nodes.Document;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

//BUILD:  javac -cp .;jsoup-1.8.3.jar ParseHTML.java
//RUN:    java -cp .;jsoup-1.8.3.jar ParseHTML


class ParseHTML
{
	
	private static void parseFromString()
	{
		String html = "<html><head><title>First parse</title></head>"
		+ "<body><p>Parsed HTML into a doc.</p></body></html>";
		
		Document doc = Jsoup.parse(html);
		
		Elements e1 = doc.select("title");//find element by tag
		String str_e1 = e1.text();
		
		System.out.println(str_e1);
	}
	
	
	private static void parseFromURL()
	{
		String url = "http://jsoup.org/";
		try
		{
			Document doc = Jsoup.connect(url).get();//HTTP GET request to url
			Elements es = doc.select("a[href]");//find element a with href(<a href="http:\\baidu.com">text</a>)
			
			for(Element e:es)
			{
				String txt = e.text();
				String href = e.attr("href");//get href property
				System.out.println(txt+" : "+href);
			}
			
		}
		catch(Exception e)
		{
			
		}
	}
	
	
	public static void main(String[] args)
	{
		try
		{
			parseFromURL();
		}
		catch(Exception e)
		{
			
		}
	}
	
}