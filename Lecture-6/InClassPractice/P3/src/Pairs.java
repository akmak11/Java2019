import java.io.*; 
import java.util.*; 

class Pairs
{ 
	private int x; 
	private int y; 

	public Pairs(int x, int y) 
	{ 
		this.x = x; 
		this.y = y; 
	}

	public void setValuex(int a)
	{
		this.x=a;
	}
	public void setValuey(int b)
	{
		this.y=b;
	}
	public int getValuex()
	{
		return this.x;
	}
	public int getValuey()
	{
		return this.y;
	}
} 

class Compare { 

	static void compare(Pairs arr[], int n) 
	{ 
		// Comparator to sort the pair according to second element 
		Arrays.sort(arr, new Comparator<Pairs>()
		{ 
			@Override public int compare(Pairs p1, Pairs p2) 
			{ 
				return p1.getValuey() - p2.getValuey(); 
			} 
		}); 
		System.out.println("\nSorted array according w.r.t. 2nd element:");
		for (int i = 0; i < n; i++)
		{ 
			System.out.print("("+arr[i].getValuex() + "," + arr[i].getValuey() + ")\t"); 
		} 
		System.out.println(); 
	} 
}