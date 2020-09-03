import java.nio.file.*;
import java.io.*;
import java.lang.*;
import java.util.*;


public class ReadFileTest{

	public static void writeToFile(String sFile,String content){
        try(Formatter output=new Formatter(sFile)){
            output.format(content+"\n");
        }
        catch(Exception e){}	
	}
    public static void readFromFile_int_file(String sFile)//1.txt
    {
        try(Scanner input = new Scanner(Paths.get(sFile)))
        {
            while(input.hasNext())
            {
                System.out.println( input.nextInt() );
            }
        }
        catch(Exception e){}
    }
    
    public static void readFromFile_int_double_file(String sFile)//2.txt
    {
        try(Scanner input = new Scanner(Paths.get(sFile)))
        {
            while(input.hasNext())
            {
                System.out.println( input.nextInt()+","+input.nextDouble() );
            }
        }
        catch(Exception e){}
    }
    
    public static void readFromFile_string_int_double_file(String sFile)//3.txt
    {
        try(Scanner input = new Scanner(Paths.get(sFile)))
        {
            while(input.hasNext())
            {
                System.out.println( input.next()+","+input.nextInt()+","+input.nextDouble() );
            }
        }
        catch(Exception e){e.printStackTrace();}
    }

    public static void readFromFile(String sFile)//4.txt
    {
        try(Scanner input = new Scanner(Paths.get(sFile)))
        {
            int sum_jack = 0;
            while(input.hasNext())
            {
                String name = input.next();
                String suject = input.next();
                int score = input.nextInt();
                if(name=="jack")
                {
                    sum_jack+=score;
                }
                
            }
        }
        catch(Exception e){e.printStackTrace();}
    }


	public static void main(String []args){
        String sFile  = "1.txt";
        readFromFile_int_file(sFile);
		sFile  = "2.txt";
		readFromFile_int_double_file(sFile);
		sFile  = "3.txt";
		readFromFile_string_int_double_file(sFile);
    }
}

   
    	
