import java.util.*;
public class Sales
{
	Scanner scan = new Scanner(System.in);

  	public static void main(String[]args)
  	{
    	// declare and initialize the array //
      	float sales[][] = new float [5][4];


 		Sales sale = new Sales();	//object of class


      	// call the function to read in the sales from the user//
      	sale.getSales(sales);
 
      	System.out.print("\t\t\tSP1\t\tSP2\t\tSP3\t\tSP4\t\tTotal\n\n");
     	 // call the function to display the sales//
     	sale.printSales(sales);
  	}
 
   


   /*getSales  *Description: reads sales figures in from the user until the user enters -1*/
 	
 	void getSales(float sales[][])
  	{
     	int salesPerson;
     	int product;
     	float value;
 		System.out.println("Enter the salesperson, product, and total sales:");
      	for (int i=0;i<4;i++)
      	{
      		System.out.print("SalesPerson: ");
      		salesPerson = scan.nextInt();
      		System.out.println();
      		System.out.print("Product: ");
      		product = scan.nextInt();
      		System.out.println();
      		System.out.print("Sales: ");
			value = scan.nextFloat();
			System.out.println("\n");
          	sales[product - 1][salesPerson - 1] += value;
      	}
    }


 		//Description: displays the sales and summaries
	

	void printSales(float sales[][])
 	{
     	for (int i=0; i<5;i++)
     	{
     		System.out.print("Product "+(i+1)+"\t\t");
     		System.out.print(sales[i][0]+"\t\t"+sales[i][1]+"\t\t"+sales[i][2]+"\t\t"+sales[i][3]+"\t\t");
     		System.out.println((sales[i][0]+sales[i][1]+sales[i][2]+sales[i][3]));
     	}
     	System.out.print("\nTotal\t\t\t");
     	for (int j=0;j<4;j++)
     	{
     		System.out.print((sales[0][j]+sales[1][j]+sales[2][j]+sales[3][j]+sales[4][j])+"\t\t");
     	}
     	System.out.println("");
    }
}