/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author S a m s u n g
 */
public class constructor {
    long modelnim;
    String modelname;
    String modelalamat;
    String modeljurusan;
    int modelangkatan;
    
   public constructor(){
        modelnim = 201869040092L;
        modelname = "ainun gita";
        modelalamat = "gerbo";
        modeljurusan = "teknik informatika";
        modelangkatan = 2018;
    }
        public static void main(String[] args) {
            constructor profil = new constructor();
            System.out.println("nim         = "+profil.modelnim);
            System.out.println("name        = "+profil.modelname);
            System.out.println("alamat      = "+profil.modelalamat);
            System.out.println("jurusan     = "+profil.modeljurusan);
            System.out.println("angkatan    = "+profil.modelangkatan);
            
            
    
    }
}


