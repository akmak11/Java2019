import java.io.*;
import java.util.*;
class FileDemo
{
	public static void main(String[] args)
	{
		File f = null;
		try
		{
			f = new File("File.txt");
			FileWriter fOut = new FileWriter(f);
			BufferedWriter bOut = new BufferedWriter(fOut);
			Scanner scan = new Scanner(System.in);
			System.out.println("\nEnter a String");
			while (scan.hasNext())
			{
				bOut.write(scan.nextLine());
				bOut.newLine();
			}
			bOut.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}