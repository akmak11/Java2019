class Stack
{ 
    int stack[] = new int[10];
    int topOfStack;
  
    Stack() 
    { 
        topOfStack = -1; 
    } 
  
    boolean isEmpty() 
    { 
        return (topOfStack==-1); 
    } 
    
    int spaceLeft()
    {
        return(9-topOfStack);
    }
    boolean isFull() 
    { 
        return (topOfStack==9);
    }

    boolean push(int x) throws PushException
    { 
        if (topOfStack >= (10 - 1))
        { 
            throw new PushException ("InvalidPush: StackOverflowError"); 
        } 
        else
        { 
            stack[++topOfStack] = x; 
            System.out.println(x + " pushed into stack"); 
            return true; 
        } 
    } 
  
    int pop() throws PopException
    { 
        if (topOfStack<0)
        { 
            throw new PopException ("Invalid Pop: StackUnderflowError");
        }
        else
        { 
            int x = stack[topOfStack--];
            System.out.println(x+" has been popped.");
            return x;
        } 
    }

    void displayStack()
    {
        if (isEmpty())
            System.out.println("Stack is empty");
        else
        {
            System.out.println("Stack is: ");
            for (int count = 0;count<(topOfStack+1);count++)
                System.out.println(stack[count]);
        }
    }
}