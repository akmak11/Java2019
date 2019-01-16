/*Program 20: Problem statement
=================================
Use a one-dimensional array to solve the following problem: Write an application that inputs five numbers, each between 10 and 100, inclusive. As each number is read, display it only if it's not a duplicate of a number already read. Provide for the "worst case," in which all five numbers are different. Display the complete set of unique values input after the user enters each new value. a) Without using function b) Using function.
=================================
Definition of Done:
a) The program should ask the user to enter 5 numbers.
b) The program should generate an error message is the value is not between 10 and 100 and ask the user to re-enter.
c) The program should display the non-duplicate entries only after each new value is read.
=================================*/
import java.util.Scanner;
class checkdup {
    static int[] arr;               	//Array declaration
       public static void main(String[] args) {
           arr = new int[5];           //Array definition
           inputnum();                 //Number input
       
    }
    static boolean isduplicate(int pos, int n) {    //Fuinction to check duplicate
            for (int k=pos-1;k>=0;k--) {            
                if(n==arr[k]){                      //Compare already filled array elements
                    return false;
                }
            }
            return true;
           }
           static void inputnum() {                //Input number
               Scanner num = new Scanner(System.in);
           
               boolean c;
               int n,i;
               for(i=0;i<5;i++){
                   System.out.println(i+"Enter number:");
                   n = num.nextInt();
                   while(!checkbetween(n)) {
                       System.out.println("Enter integer between 10 - 100:");  //check validity
                       n = num.nextInt();
                   }
                   if(!isduplicate(i,n)){          //check duplicate
                     System.out.println("Duplicate entry");
                       i=i-1;
                       continue;
                   }
                   arr[i]=n;
		   printarray(i);
               }
           }
           static boolean checkbetween(int n) {    //function to check number inbetween 10-100
               if(n>9 && n<101){
                   return true;
               }
               else {
                   return false;
               }
                   
           }
	   static void printarray(int pos){
		   System.out.println("=================");	
	           for(int i=0;i<=pos;i++){       //Array printing
	               System.out.print(arr[i]+" ");
        	   }
		   System.out.println("\n=================");	
	   }	

}

