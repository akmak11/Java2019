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
        return (topOfStack<0); 
    } 
    
    boolean push(int x) 
    { 
        if (topOfStack >= (10 - 1))
        { 
            System.out.println("Stack Overflow"); 
            return false; 
        } 
        else
        { 
            stack[++topOfStack] = x; 
            System.out.println(x + " pushed into stack"); 
            return true; 
        } 
    } 
  
    int pop() 
    { 
        if (topOfStack<0)
        { 
            System.out.println("Stack Underflow"); 
            return 0; 
        } 
        else
        { 
            int x = stack[topOfStack--]; 
            return x; 
        } 
    } 
}