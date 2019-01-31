import java.io.*;
class FileRead
{
	public static void main(String[] args)
	{
		File f = new File("File.txt");
		try
		{

			FileReader fin = new FileReader(f);
			BufferedReader bin = new BufferedReader(fin);

			String sr;
			System.out.println("Contents are: ");
			while ((sr=bin.readLine())!=null)
			{
				System.out.println(sr);
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}