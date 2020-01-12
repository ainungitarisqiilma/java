/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan;

/**
 *
 * @author S a m s u n g
 */
public class song {
    public void songSound() {
    System.out.println("CHENK SOUND BERBAGAI GENRE");
  }
}

class Dangdut extends song {
  public void songSound() {
    System.out.println("chekc sound Dangdut: Hak...e...Hak...e...");
  }
}

class Kpop extends song {
  public void songSound() {
    System.out.println("chenk sound Kpop: Huuuuu...Haaaaaaa...");
  }
}

class MyMainClass {
  public static void main(String[] args) {
    song mysong = new song();  // Create a Animal object
    song myDangdut = new Dangdut();  // Create a Pig object
    song myKpop = new Kpop();  // Create a Dog object
    mysong.songSound();
    myDangdut.songSound();
    myKpop.songSound();
  }
}

