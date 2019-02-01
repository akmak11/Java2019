import java.util.*;
class Example1
{
	public static void main(String[] args)
	{
		ArrayList <String> al = new ArrayList <String>();
		al.add("Amit");
		al.add("Vijay");
		al.add("Kumar");
		al.add(1,"Sachin");
		System.out.println("Element at 2nd position is "+al.get(2));

		ListIterator <String> itr = al.listIterator();
		System.out.println("Traversing forward: ");
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}

		System.out.println("Traversing backwards: ");
		while (itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
	}
}