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
public class KelasLuarStatic {
    //Class dalam/Inner Class Static
    private static class RuangGuru{
        private String language;
        private void setLanguage(String language){
            this.language = language;
        }
        private String getLanguage(){
            return language;
        }
    }
    
    public static void main(String[] args){
        //Membuat Instance dari Kelas Dalam (Programming)
        KelasLuarStatic.RuangGuru MyLanguage = new KelasLuarStatic.RuangGuru();
        
        //Memasukan Nilai/Value
        MyLanguage.setLanguage("Khursus Bahasa Inggris");
        
        //Menampilkan Hasil Output
        System.out.println("Saya Sedang Mempelajari: "+MyLanguage.getLanguage());
    }
}





