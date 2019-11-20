/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudyKasus2;
import java.util.*;
/**
 *
 * @author S a m s u n g
 */
public class Segitiga extends BangunDatar2{
    public void Segitiga(){
        double ls,as,ts,ss,ks;
        Scanner a = new Scanner (System.in);
        System.out.println("SEGITIGA");
        System.out.println("---------");
        System.out.println("Masukan alas : ");
        as = a.nextDouble();
        System.out.println("Masukan tinggi : ");
        ts = a.nextDouble();
        System.out.println("Masukan sisi : ");
        ss = a.nextDouble();
        ls =(as*ts)/2;
        ks = (ss*2)*as;
        
        System.out.println("Luas Segitiga Adalah : "+ls);
         System.out.println("Keliling Segitiga Adalah : "+ks);
               
        
    }
    
}
