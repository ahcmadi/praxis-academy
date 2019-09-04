package Annotation;

import Annotation.Base;
import Annotation.Derived;

class Base
{
     public void display()
     {
         System.out.println("Base display()");
     }
}

public class Derived extends Base{

    @Override
    public void display()
    {
        System.out.println("Derived display(int )");
    }
    public static void main(String args[])
    {
        Derived obj = new Derived();
        obj.display();
    }
}
