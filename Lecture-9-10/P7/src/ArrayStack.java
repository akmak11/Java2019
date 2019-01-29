import java.util.Scanner;
public class ArrayStack
{ 
    public static void main(String args[]) 
    { 
        Scanner scan=new Scanner(System.in);
        Stack s = new Stack();
        char cont;
        do
        {
            System.out.println("Choose any one option:");
            System.out.println("1. push()");
            System.out.println("2. pop()");
            System.out.println("3. isEmpty()");
            System.out.println("4. isFull()");
            System.out.println("5. spaceLeft()");
            System.out.println("6. displayStack()");
            int choice = scan.nextInt();
            switch(choice)
            {
                case 1:
                System.out.println("Enter the value to be pushed");
                int x=scan.nextInt();
                try
                {   
                    s.push(x);
                }
                catch (Exception e)
                {
                    System.out.println(e);
                }
                break;
    
                case 2:
                try
                {
                    s.pop();
                }
                catch (Exception e)
                {
                    System.out.println(e);
                }
                break;

                case 3:
                System.out.println(s.isEmpty());
                break;

                case 4:
                System.out.println(s.isFull());
                break;

                case 5:
                int spcLeft=s.spaceLeft();
                System.out.println(spcLeft);
                break;

                case 6:
                s.displayStack();
                break;

                default: System.out.println("Invalid Choice");
            }
            System.out.println("Do you want to continue?? Y/N");
            cont=scan.next().charAt(0);
        }
        while(cont=='Y');
    }
} 