import java.net.*;
import java.io.*;

public class MyURL
{
    public static void main(String[] b)
    {
        try
        {
            URL a = new URL("http://example.com:80/docs/books/tutorial"
+ "/index.html?name=networking#DOWNLOADING");
            System.out.println("protocol="+a.getProtocol());
            System.out.println("authority="+a.getAuthority());//example.com:80
            System.out.println("host="+a.getHost());//example.com
            System.out.println("port="+a.getPort());//80
            System.out.println("path="+a.getPath());//  /docs/books/tutorial/index.html
            System.out.println("query="+a.getQuery());// name=networking
            System.out.println("fileName="+a.getFile());// file=path+query, /docs/books/tutorial/index.html?name=networking
            System.out.println("ref="+a.getRef());//DOWNLOADING
        }
        catch(MalformedURLException e)
        {
            System.out.println("exception");
        }
    }
}