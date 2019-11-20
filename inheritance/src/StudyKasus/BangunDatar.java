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
public class BangunDatar {
    protected String Tema = "Rumus";
    public void honk(){
        System.out.println("Nama bangun datar");
        System.out.println("---------------------");
        System.out.println("Lingkaran");
        System.out.println("Persegi_Panjang");
        System.out.println("Segitigar");
        System.out.println("Persegi");
}
}
class bangun_datar extends BangunDatar {
    private String Rumus = " Lingkaran      = phi * r * r \n"
                         + "Persegi Panjang = p * L \n"
                         + "Segetiga        = A * T / 2 \n"
                         + "Persegi         = S * S";
    public static void main (String [] args){  
        bangun_datar MTK = new bangun_datar();
        MTK.honk();
        

        System.out.println ();
        System.out.println (MTK.Tema);
        System.out.println (MTK.Rumus);
    }
}
        