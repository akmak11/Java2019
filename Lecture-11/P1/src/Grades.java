import java.io.*;
import java.util.*;
class Grades
{
   public static void main(String[] args)
   {
    	Scanner scan = new Scanner(System.in);
      	File f = new File ("Data.txt");
      	try
      	{
        	FileWriter fout = new FileWriter(f);
        	BufferedWriter bout= new BufferedWriter(fout);
        	boolean flag = true;

        	while(flag)
        	{
        		System.out.print("\nEnter the serial number: ");
        		bout.write(Integer.toString(scan.nextInt()));
      	  		bout.write(' ');
      		  	System.out.print("\nEnter the first name: ");
     		   	bout.write(scan.next());
     	   		bout.write(' ');
        		System.out.print("\nEnter CGPA obtained: ");
        		bout.write(Float.toString(scan.nextFloat()));
        		bout.write(' ');
        		System.out.print("\nEnter grade secured: ");
    	    	bout.write(scan.next().charAt(0));
    	    	bout.newLine();
	
        		System.out.println("\nDo you want to continue?");
        		char c = scan.next().charAt(0);
        		if (c=='y' || c=='Y')
        			flag = true;
        		else
        			flag = false;
			}
			bout.close();
		}
    	catch (Exception e)	{ e.printStackTrace();	}

    	try
    	{
    		FileReader fin = new FileReader(f);
			BufferedReader bin = new BufferedReader(fin);
			String sr;
			System.out.println("\nEntered data is as follow:");
			while ((sr=bin.readLine())!=null)
			{
				String[] strs = sr.split(" ");
				System.out.println(strs[0] + " " + strs[1] + " " + strs[2] + " " + strs[3]);
			}
		}
		catch (Exception e) { e.printStackTrace(); }
	}
}