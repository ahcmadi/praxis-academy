/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu0202;

import com.sun.tools.javac.Main;

/**
 *
 * @author achmadi
 */
public class MyClass {
  public  int multiply(int x, int y) {
    // the following is just an example
    if (x > 999) {
      throw new IllegalArgumentException("X should be less than 1000");
    }
    return x * y;
  }
//  public static void main(String[] args)  {
//        
//        System.out.println(multiply(2,3));
//    }
}
