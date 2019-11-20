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
public class Private {
    
  private String fname = "Ainun GIta";
  private String lname = "Gita";
  private String email = "ainungita03@gmail.com";
  private int age = 21;
  
  public static void main(String[] args) {
    Private myObj = new Private();
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Email: " + myObj.email);
    System.out.println("Age: " + myObj.age);
  }
}


