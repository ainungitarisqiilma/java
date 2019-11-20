/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudyKasus2;
import java.util.Scanner;
/**
 *
 * @author S a m s u n g
 */
public class PersegiPanjang {
    public void PersegiPanjang(){
    double pp,lep,lp,kp;
        Scanner d = new Scanner (System.in);
        System.out.println("PERSEGI PANJANG");
        System.out.println("===============");
        System.out.println("Masukan Panjang :");
        pp = d.nextDouble();
        System.out.println("Masukan Lebar ;");
        lep = d.nextDouble();
        lp = pp*lep;
        kp = (2*pp)+(2*lep);
          System.out.println("Luas Persegi Panjang Adalah : "+lp);
         System.out.println("Keliling Persegi Panjang Adalah : "+kp);
    }
    
    
}
