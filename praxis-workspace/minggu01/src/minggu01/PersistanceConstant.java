package minggu01;

public class PersistanceConstant implements java.io.Serializable {

	    private int value;
	    private transient String name;
	    
	    public static final PersistanceConstant RED   = new PersistanceConstant( 0, "Red"   );
	    public static final PersistanceConstant BLUE  = new PersistanceConstant( 1, "Blue"  );
	    public static final PersistanceConstant GREEN = new PersistanceConstant( 2, "Green" );
	    private PersistanceConstant( int value, String name )
	    {
	        this.value = value;
	        this.name = name;
	    }
	    
	    public int getValue()
	    {
	        return value;
	    }
	    
	    public String toString()
	    {
	        return name;
	    }
	
}
