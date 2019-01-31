import java.io.File;
public class FileD
{
	public static void main(String[] args)
	{
		File f = null;
		String strs = ("File.txt");
		try
		{
			f = new File(strs);
			String a = f.getAbsolutePath();
			System.out.println("\n"+a);
			System.out.println("\nLength is: "+f.length());
			System.out.println(f.canExecute());
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}