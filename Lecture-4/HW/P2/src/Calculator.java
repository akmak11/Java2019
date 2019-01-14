import java.util.Scanner;
public class Calculator
{
	Scanner scan = new Scanner(System.in);
	void elements (int arr[])
	{
		for (int i=0;i<5;i++)
			System.out.println(arr[i]);
	}

	
	void sumOfElements(int arr[])
	{
		int sum=0;
		for (int i=0;i<5;i++)
		{
			sum+=arr[i];
		}
		System.out.println("Sum = "+sum);
	}

	void largest(int arr[])
	{
		int max = arr[0];
        for(int i = 0; i <5; i++)
        {
            if(max < arr[i])
            {
                max = arr[i];
            }
        }
        System.out.println("Maximum value:"+max);
	}

	void smallest(int arr[])
	{
		int min = arr[0];
        for(int i = 0; i <5; i++)
        {
            if(min > arr[i])
            {
                min = arr[i];
            }
        }
        System.out.println("Minimun value:"+min);
	}

	void secondLargest(int arr[])
	{
		int i, first, second; 
   		first = second = Integer.MIN_VALUE; 
        for (i = 0; i <5 ; i++) 
        { 
            if (arr[i] > first) 
            { 
                second = first; 
                first = arr[i]; 
            } 
       
            else if (arr[i] > second && arr[i] != first) 
                second = arr[i]; 
        } 
          
        if (second == Integer.MIN_VALUE) 
             System.out.println("There is no second largest element"); 
        else
             System.out.println("The second largest element is "+ second); 
    }

    void countEven(int arr[])
    {
    	int count=0;
    	for (int i=0;i<5;i++)
    	{
    		if (arr[i]%2==0)
    			count+=1;
    	}
    	System.out.println("There are "+count+" even numbers");
    }

    void sumOfAlternate(int arr[])
    {

    }

    void frequency (int arr[])
    {
    	System.out.println("Which element's frequency do you want to calculate");
    	int fele=scan.nextInt();
    	int frequency=0;
    	for (int i = 0;i<5;i++)
    	{
    		if (arr[i]==fele)
    			frequency++;
    	}
    	System.out.println(fele+" occurs "+frequency+" times in the array");
    }

	public static void main (String[]args)
	{
		Scanner scan = new Scanner(System.in);
		char choice;
		int option;
		Calculator calc = new Calculator();
		do
		{
			System.out.println("Enter the elements of array");
			int arr[] = new int[5];
			for(int i=0;i<5;i++)
			{
				arr[i]=scan.nextInt();
			}
			System.out.println("Choose an option:\n1.Display the elements\n2.Sum of all the elements\n3.Largest number in array");
			System.out.println("4.Smallest number in array\n5.Second Largest number in array\n6.Sum of alternate elements in array");
			System.out.println("7.Count even numbers in array\n8.Frequency of a number in array");
			option = scan.nextInt();
			switch (option)
			{
				case 1:
				{calc.elements(arr);	break;}
				case 2:
				{calc.sumOfElements(arr);	break;}
				case 3:
				{calc.largest(arr);	break;}
				case 4:
				{calc.smallest(arr);	break;}
				case 5:
				{calc.secondLargest(arr); 	break;}
				case 6:
				{calc.sumOfAlternate(arr);	break;}
				case 7:
				{calc.countEven(arr);	break;}
				case 8:
				{calc.frequency(arr);	break;}
			}
			System.out.println("If you want to run the program for another array press 'Y' otherwise 'N'");
			choice=scan.next().charAt(0);
		}
		while(choice=='Y');
	}
}