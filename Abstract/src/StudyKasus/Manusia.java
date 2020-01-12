/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudyKasus;
/**
 *
 * @author S a m s u n g
 */

    // Abstract class
abstract class Manusia {
  // Abstract method (does not have a body)
  public abstract void ManusiaSound();
  // Regular method
  public void Happy() {
    System.out.println("yeyeyyyyy");
  }
}

// Subclass (inherit from Animal)
class Gita extends Manusia {
  public void ManusiaSound() {
    // The body of animalSound() is provided here
    System.out.println("Gita says: wee wee");
  }
}

class MyMainClass {
  public static void main(String[] args) {
    Gita myGita = new Gita(); // Create a Pig object
    myGita.ManusiaSound();
    myGita.Happy();
  }
}
