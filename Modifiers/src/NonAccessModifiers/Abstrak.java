/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NonAccessModifiers;

/**
 *
 * @author S a m s u n g
 */

    // abstract class
abstract class Person {
  public String fname = "John";
  public String lname = "Doe";
  public String email = "john@doe.com";
  public int age = 24;
  public abstract void study(); // abstract method 
}

// Subclass (inherit from Person)
class Student extends Person {
  public int graduationYear = 2018;
  public void study() {
    System.out.println("Studying all day long");
  }
}


public class Abstrak {
  public static void main(String[] args) {
    // create an object of the Student class (which inherits attributes and methods from Person)
    Student myObj = new Student(); 
    
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Email: " + myObj.email);
    System.out.println("Age: " + myObj.age);
    System.out.println("Graduation Year: " + myObj.graduationYear);
    myObj.study(); // call abstract method
  }
}

