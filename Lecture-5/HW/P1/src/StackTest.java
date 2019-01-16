import java.util.Scanner;
public class StackTest
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
            int choice = scan.nextInt();
            switch(choice)
            {
                case 1:
                System.out.println("Enter the value to be pushed");
                int x=scan.nextInt();
                s.push(x);
                break;
    
                case 2:
                s.pop();
                break;

                case 3:
                System.out.println(s.isEmpty());
                break;

                case 4:
                System.out.println(s.isFull());
                break;

                default: System.out.println("Invalid Choice");
            }
            System.out.println("Do you want to continue?? Y/N");
            cont=scan.next().charAt(0);
        }
        while(cont=='Y');
    }
} 