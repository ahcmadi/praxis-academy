package Annotation;

import Annotation.ParentClass;
import Annotation.SubClass;

/**
 * 
 * @author achmadi
 * link : https://beginnersbook.com/2014/07/override-annotation-in-java/
 *
 */
class ParentClass
{
	public void displayMethod(String msg){
		System.out.println(msg);
	}
}

public class SubClass extends ParentClass {
	
	@Override
	public void displayMethod(String msg){
		System.out.println("Message is: "+ msg);
	}
	
	public static void main(String args[]){
		SubClass obj = new SubClass();
		obj.displayMethod("Hey!!");
	}
	
	@Deprecated
	public void anyMethodHere(){
	    // Do something
	}
}

