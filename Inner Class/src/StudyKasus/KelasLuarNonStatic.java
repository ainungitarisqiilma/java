/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudyKasus;
//Outer Class/Kelas Luar
/**
 *
 * @author S a m s u n g
 */
public class KelasLuarNonStatic {
    
    //Class dalam/Inner Class Pertama
    private class Kapal{
        private String merk = "FERRY RO-RO";
        private float kecepatan = 1000.0f;
        private void jalankan(){
            System.out.println("Merk Kapal: "+merk);
            System.out.println("Kecepatan Kapal: "+kecepatan);
        }
    }
    
    //Class dalam/Inner Class Kedua
    private class Pengguna{
        private String nama = "Ainun Gita";
        private int umur = 20;
        private void identitas(){
            System.out.println("Nama Saya: "+nama);
            System.out.println("Usia Saya: "+umur);
        }
    }
    
    public static void main(String[] args){
        //Membuat Instance dari KelasLuar
        KelasLuarNonStatic outerclass = new KelasLuarNonStatic();
        //Membuat Instance dari KelasDalam (Mobil)
        KelasLuarNonStatic.Kapal data1 = outerclass.new Kapal();
        //Membuat Instance dari KelasDalam (Pengguna)
        KelasLuarNonStatic.Pengguna data2 = outerclass.new Pengguna();
        
        //Menampilkan Hasil Output
        System.out.println("===== DATA DARI CLASS KAPAL ========");
        data1.jalankan();
        System.out.println("===== DATA DARI CLASS PENGGUNA =====");
        data2.identitas();
    }
}




