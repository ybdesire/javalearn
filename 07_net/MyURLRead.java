import java.net.*;
import java.io.*;

public class MyURLRead
{
    public static void main(String[] b)
    {
        try
        {
            //URL a = new URL("https://github.com/ybdesire/machinelearning#32-un-supervised-learning");
            URL a = new URL("https://www.java.com/en/download/help/");
            BufferedReader in = new BufferedReader(new InputStreamReader(a.openStream()));
            String inputLine = in.readLine();
            int count = 0;
            while(inputLine!=null)
            {
                System.out.println(inputLine);
                count++;
                inputLine = in.readLine();
            }
            System.out.println("line count="+count);
            in.close();
        }
        catch(Exception e)
        {
            System.out.println("exception");
        }
    }
}