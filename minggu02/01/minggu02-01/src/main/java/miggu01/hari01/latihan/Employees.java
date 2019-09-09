/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miggu01.hari01.latihan;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author achmadi
 */
public class Employees {
    
   static class Employee
   {
      private String name;
      private int age;

      Employee(String name, int age)
      {
         this.name = name;
         this.age = age;
      }

      int getAge()
      {
         return age;
      }

      @Override
      public String toString()
      {
         return name + ": " + age;
      }
   }

   public static void main(String[] args)
   {
      List<Employee> employees = new ArrayList<>();
      employees.add(new Employee("John Doe", 63));
      employees.add(new Employee("Sally Smith", 29));
      employees.add(new Employee("Bob Jone", 36));
      employees.add(new Employee("Margaret Foster", 53));
      printEmployee1(employees, 50);
      System.out.println();
      printEmployee2(employees, 50);
   }
   /**
    * Imperative method
    * @param employees
    * @param age 
    */
   public static void printEmployee1(List<Employee> employees, int age)
   {
      for (Employee emp: employees)
         if (emp.getAge() < age)
            System.out.println(emp);
   }
   /**
    * declarative method
    * @param employees
    * @param age 
    */
   public static void printEmployee2(List<Employee> employees, int age)
   {
      employees.stream()
               .filter(emp -> emp.age < age)
               .forEach(emp -> System.out.println(emp));
   }
}
