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
public class Public1 {

  public String fname = "Ainun GIta";
  public String lname = "Gita";
  public String email = "ainungita03@gmail.com";
  public int age = 21;
}

    class Myclass {
    public static void main(String[] args) {
    Public1 myObj = new Public1(); 
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Email: " + myObj.email);
    System.out.println("Age: " + myObj.age);
  }
}
  

