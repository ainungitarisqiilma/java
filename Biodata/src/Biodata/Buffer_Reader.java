/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biodata;
import java.io.*;
/**
 *
 * @author S a m s u n g
 */
public class Buffer_Reader {
    public static void main(String [] args){
    BufferedReader input = new BufferedReader(new InputStreamReader (System.in) );
    
   
    try{
    
        System.out.print("Nama                  :");
        String Nama = input.readLine();
        System.out.print("Alamat                   :");
        String Alamat = input.readLine();
        System.out.print("Jurusan                  :");
        String Jurusan = input.readLine();
        System.out.print("Jenis_Kelamin                  :");
        String Jenis_Kelamin = input.readLine();
        System.out.print("Nim                 :");
        String Nim = input.readLine();
        System.out.print("Tahun_Angkatan                 :");
        String Tahun_Angkatan = input.readLine();
        
        
            System.out.println("Nim             :         " + Nim);
            System.out.println("Nama            :         " + Nama);
            System.out.println("Alamat          :         " + Alamat);
            System.out.println("Jurusan         :         " + Jurusan);
            System.out.println("Tahun_Angkatan  :         " + Tahun_Angkatan);
            System.out.println("Jenis_Kelamin   :         " + Jenis_Kelamin);
    }catch (IOException ex){
        System.out.println("terjadi kesalahan pada input");
}
    
    }
}
