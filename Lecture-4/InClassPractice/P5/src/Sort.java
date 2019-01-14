import java.util.*;
public class Sort
{
	public static void main (String[]args)
	{
		Scanner scan = new Scanner(System.in);
		int arr1[] = new int[4];
		int arr2[] = new int[5];
		int arr3[] = new int[9];
		System.out.println("Enter the 1st SORTED ARRAY (4 elements)");
		for (int i=0;i<4;i++)
			arr1[i]= scan.nextInt();
		System.out.println("Enter the 2nd SORTED ARRAY (5 elements)");
		for (int i=0;i<5;i++)
			arr2[i]= scan.nextInt();
		int i=0,j=0,k=0;
		while (i<4 && j<5)
		{
			if (arr1[i]<arr2[j])
			{
				arr3[k]=arr1[i];
				i++;
			}
			else
			{
				arr3[k]=arr2[j];
				j++;
			}
			k++;
		}
		if (i<4)
			System.arraycopy(arr1,i,arr3,k,(arr1.length-i));
		if (j<5)
			System.arraycopy(arr2,j,arr3,k,(arr2.length-j));
		System.out.println("Merged and Sorted Array:");
		for (int d=0;d<9;d++)
			System.out.println(arr3[d]);
		}
}