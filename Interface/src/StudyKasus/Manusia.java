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

    interface Manusia {
  public void ManusiaSound(); // interface method (does not have a body)
  public void Happy(); // interface method (does not have a body)
}

// Pig "implements" the Animal interface
class Cewek implements Manusia {
  public void ManusiaSound() {
    // The body of animalSound() is provided here
    System.out.println("GIta says: YeeeYeeeeyyyyy");
  }
  public void Happy() {
    // The body of sleep() is provided here
    System.out.println("yeeeeeeeee");
  }
}

class MyMainClass {
  public static void main(String[] args) {
    Cewek myGita = new Cewek();  // Create a Pig object
    myGita.ManusiaSound();
    myGita.Happy();
  }
}

