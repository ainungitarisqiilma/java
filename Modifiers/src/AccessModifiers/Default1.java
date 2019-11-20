/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccessModifiers;

/**
 *
 * @author S a m s u n g
 */
public class Default1 {
    String fname = "Ainun Gita";
  String lname = "GIta";
  String email = "ainungita03@gmail.com";
  int age = 21;
  
  public static void main(String[] args) {
    Default1 myObj = new Default1();
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Email: " + myObj.email);
    System.out.println("Age: " + myObj.age);
  }
}


