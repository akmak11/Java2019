import java.util.*;
class VehicleTest
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of tyres in vehicle");
		int nTyres = scan.nextInt();
		switch (nTyres)
		{
			case 0:
				System.out.println("Not a vehicle");
				break;
			case 1:
				System.out.println("Not a vehicle");
				break;
			case 2:
				Bike b = new Bike();
				b.display();
				break;
			case 4:
				Car c = new Car();
				c.display();
				break;
			default:
				Vehicle v = new Vehicle();
				v.display();
		}
	}
}