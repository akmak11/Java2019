public class IntegerSet 
{
	private static final int MAX_SET_SIZE = 101;
      
    private final boolean[] booleanArray = new boolean[ MAX_SET_SIZE ];
      
    public static IntegerSet union( IntegerSet set1, IntegerSet set2 )
    {
        IntegerSet union = new IntegerSet();
        System.arraycopy( set1.booleanArray, 0, union.booleanArray, 0, MAX_SET_SIZE );
        for ( int i = 0; i < MAX_SET_SIZE; i++ )
        {
            if ( set2.booleanArray[ i ] )
            {
                union.booleanArray[ i ] = true;
            }
        }
          return union;
    }
      
    public static IntegerSet intersection( IntegerSet set1, IntegerSet set2 )
    {
        IntegerSet intersection = new IntegerSet();
        for ( int i = 0; i < MAX_SET_SIZE; i++ )
        {
			intersection.booleanArray[ i ] = set1.booleanArray[ i ] && set2.booleanArray[ i ];
        }
          return intersection;
    }
      
    public void insertElement( int element )
    {
    	booleanArray[ element ] = true;
    }
      
    public void deleteElement( int element )
    {
    	booleanArray[ element ] = false;
    }
      
    @Override
    public String toString()
    {
       	boolean isEmpty = true;
        StringBuilder string = new StringBuilder();
        string.append( "{ " );
        for ( int i = 0; i < MAX_SET_SIZE; i++ )
        {
            if ( booleanArray[ i ] )
            {
                isEmpty = false;
                string.append( i ).append( ' ' );
            }
        }
        return isEmpty ? "---" : string.append( '}').toString();
    }
      
    public boolean isEqual( IntegerSet set )
    {
        for ( int i = 0; i < MAX_SET_SIZE; i++ )
        {
            if ( booleanArray[ i ] != set.booleanArray[ i ] )
            {
                return false;
            }
        }
          return true;
    }
    

    public static void main( String[] args )
    {
        IntegerSet integerSet1 = new IntegerSet();
        
        System.out.println("intergerSet1 is empty: " + integerSet1 );
        
        IntegerSet integerSet2 = new IntegerSet();
        
        System.out.println("empty set union empty set is empty set:  " + union( integerSet1, integerSet2 ) );
        
        IntegerSet universe = new IntegerSet();
        

        for ( int i = 0; i <  MAX_SET_SIZE; i++)
        {
           universe.booleanArray[ i ] = true;
       	}


        System.out.println( "universe: " + universe );
        System.out.println("empty set union universe = universe:  " + union( integerSet1, universe ) );
	    System.out.println("empty set intersection universe = empty set:  " + intersection( integerSet1, universe ) );
        
        integerSet1.insertElement( 0 );
        System.out.println("intergerSet1 has only element 0: " + integerSet1 );
        System.out.println("intergerSet1 != integerSet2: isEqual: " + integerSet1.isEqual( integerSet2 ) );
        System.out.println("intergerSet2 != integerSet1: isEqual: " + integerSet2.isEqual( integerSet1 ) );
        
        integerSet2.insertElement( 0 );
        System.out.println("intergerSet1 == integerSet2: isEqual: " + integerSet1.isEqual( integerSet2 ) );
        integerSet1.deleteElement( 0 );
        System.out.println("intergerSet1 is empty: " + integerSet1 );
    }
}