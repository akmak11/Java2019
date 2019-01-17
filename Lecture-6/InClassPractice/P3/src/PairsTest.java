import java.util.*;
class PairsTest
{ 
	public static void main(String[] args) 
	{ 
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of pairs: "); 
		int n = scan.nextInt(); 

		Pairs arr[] = new Pairs [n];
		for (int i=0;i<n;i++)
		{
			System.out.println("Enter element 1 of pair "+(i+1));
			int e1 = scan.nextInt();
			System.out.println("Enter element 2 of pair "+(i+1));
			int e2 = scan.nextInt();
			arr[i] = new Pairs (e1,e2);
		}

		Compare obj = new Compare(); 
		obj.compare(arr, n); 
	} 
} 
