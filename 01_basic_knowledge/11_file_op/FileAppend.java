import java.io.*;

class FileAppend
{
	public static void main(String args[])
	{
		try {
			String str = "123abc\r\n";
			File file = new File("mytext.txt");
			if(!file.exists())
			{
				file.createNewFile();
				System.out.println("File not exist");
				
			}
			else
			{
				System.out.println("File is exist");
			}				
			
			FileWriter fw = new FileWriter(file, true);
			BufferedWriter bw = new BufferedWriter(fw);
				
			bw.write(str);
			bw.close();

		}catch (IOException e) {
			//exception handling left as an exercise for the reader
		}
	}
}