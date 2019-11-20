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
public class Persegi extends BangunDatar2 {
    public void Persegi(){
        double sb,lb,kb;
        Scanner c = new Scanner (System.in);
        System.out.println("BUJUR SANGKAR");
        System.out.println("===============");
        System.out.println("Masukan Panjang :");
        System.out.println("Masukan sisi ;");
        sb = c.nextDouble();
        lb = sb*sb;
        kb = 4*sb;
          System.out.println("Luas Persegi Adalah : "+lb);
         System.out.println("Keliling Persegi Adalah : "+kb);
    }
}

