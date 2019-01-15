public class BoxDemo
{
	public static void main(String[]args)
	{
		Box b1 = new Box();
		b1.setDim();
		double volume = b1.volume();
		System.out.println("The volume is "+volume+"\n");

		// use of parameterized constructors
		Box b2 = new Box();
		Box b3 = new Box(5,6,8);
		Box b4 = new Box(8,9);
		volume = b2.volume();
		System.out.println("The volume is "+volume);
		volume = b3.volume();
		System.out.println("The volume is "+volume);
		volume = b4.volume();
		System.out.println("The volume is "+volume);
		
	}
}