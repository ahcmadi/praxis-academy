package Annotation;

import Annotation.Annotation;
import Annotation.MyParentClass;

/**
 * 
 * @author achmadi
 * link : https://beginnersbook.com/2014/09/java-annotations/
 *
 */
class MyParentClass {

    public  void justaMethod(String msg) {
        System.out.println("Parent class method");
    }
}


 public class Annotation extends MyParentClass {

	public static void main(String[] args) {
		
		System.out.println("print Annotation ");
		Annotation ann = new Annotation();
		ann.justaMethod("Hey!!");

	}
	@Override
	public void justaMethod(String msg) {
        System.out.println("Child class method "+msg);
    }

}
