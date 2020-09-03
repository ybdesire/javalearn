import java.io.*;
import java.util.*;

public class WriteFile{
    
    public static void writeToFile(String sFile, String content)
    {
        try(Formatter output = new Formatter(sFile))//replace old file conente
        {
            output.format("%s", content);
        }
        catch(Exception ex)
        {
        }
    }
	public static void main(String []args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter file name: ");
		String sFile = input.nextLine();
        String content = "";
        while(input.hasNext())
        {
            content += input.next()+"\n";
        }
        writeToFile(sFile, content);
        
        
    }
}