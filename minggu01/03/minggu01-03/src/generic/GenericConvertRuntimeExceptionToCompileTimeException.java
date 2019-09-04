package generic;

import java.util.ArrayList;

public class GenericConvertRuntimeExceptionToCompileTimeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creating a an ArrayList with String specified 
        ArrayList <String> al = new ArrayList<String> (); 
  
        al.add("Sachin"); 
        al.add("Rahul"); 
  
        // Now Compiler doesn't allow this 
        al.add(10);  
  
        String s1 = (String)al.get(0); 
        String s2 = (String)al.get(1); 
        String s3 = (String)al.get(2); 
	}

}
