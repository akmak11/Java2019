import java.io.*;
import java.util.*;
public class Find
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		try
		{
			System.out.println("Enter the word to be searched:");
			String find = scan.nextLine();
			File f = new File ("Data.txt");
			FileReader fin = new FileReader (f);
			BufferedReader bin = new BufferedReader (fin);
			boolean flag = true, found = true;
			String s;
			while ((s=bin.readLine())!=null && flag)
			{
				if (s.equals(find))
				{
					System.out.println("Present");
					flag = false;
				}
				else
					found = false;
			}
				if (found == false) System.out.println("Not Present");
		}
		catch (Exception e) { e.printStackTrace();}
	}
}