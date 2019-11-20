/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biodata;
import java.util.Scanner;
/**
 *
 * @author S a m s u n g
 */
public class inputbiodata {
    public static void main(String [] args){
        System.out.println("Sistem Input inputbiodata");
      
        Scanner input = new Scanner (System.in);
        
        
        System.out.print("Nama                  :");
        String Nama = input.nextLine();
        
        System.out.print("Alamat                :");
        String Alamat = input.nextLine();
        
        System.out.print("Jurusan               :");
        String Jurusan = input.nextLine();
        
        System.out.print("Jenis_Kelamain        :");
        String Jenis_Kelamin = input.nextLine();
        
        System.out.print("Tahun_Angkatan        :");
        int Tahun_Angkatan = input.nextInt();
        
        System.out.print("NIM                   :");
        Long Nim = input.nextLong();
        
        
        
        
            System.out.println("Nim             :         " + Nim);
            System.out.println("Nama            :         " + Nama);
            System.out.println("Alamat          :         " + Alamat);
            System.out.println("Jurusan         :         " + Jurusan);
            System.out.println("Tahun_Angkatan  :         " + Tahun_Angkatan);
            System.out.println("Jenis_Kelamin   :         " + Jenis_Kelamin);
    }
}