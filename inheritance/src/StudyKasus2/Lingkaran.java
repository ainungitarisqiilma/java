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
public class Lingkaran extends BangunDatar2  {
    public void Lingkaran (){
        double ll,rl,kl,phi = 3.14;
        Scanner b = new Scanner (System.in);
        System.out.println("LINGKARAN");
        System.out.println("---------");
        System.out.println("mASUKAN Jari-jari : ");
        rl = b.nextDouble();
        ll = phi*rl*rl;
        kl = 2*phi*rl;
        System.out.println("Luas Lingkaran Adalah : "+ll);
         System.out.println("Keliling Lingkaran Adalah : "+kl);
               
        
    }
}
