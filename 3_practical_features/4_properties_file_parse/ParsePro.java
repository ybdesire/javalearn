import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;

public class ParsePro
{
	public static void main(String[] args)
	{
		try {
			Properties conf = new Properties();
			FileInputStream in = new FileInputStream("conf.properties");
			conf.load(in);
			in.close();
			
			String url = conf.getProperty("dbhandle.db.url", "");
			System.out.println("url: " + url);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}