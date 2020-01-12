/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplikasiku;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author S a m s u n g
 */
public class StudyKasusCRUD {
     static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
static final String DB_URL = "jdbc:mysql://localhost/makanan";
static final String USER = "root";
static final String PASS = "";

static Connection conn;
static Statement stmt;
static ResultSet rs;

static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
static BufferedReader input = new BufferedReader(inputStreamReader);
public static void main(String[] args) {

    try {
        // register driver
        Class.forName(JDBC_DRIVER);

        conn = DriverManager.getConnection(DB_URL, USER, PASS);
        stmt = conn.createStatement();

        while (!conn.isClosed()) {
            showMenu();
        }

        stmt.close();
        conn.close();

    } catch (Exception e) {
        e.printStackTrace();
    }

}
static void showMenu() {
    System.out.println("\n========= MENU UTAMA =========");
    System.out.println("1. Insert Data");
    System.out.println("2. Show Data");
    System.out.println("3. Edit Data");
    System.out.println("4. Delete Data");
    System.out.println("0. Keluar");
    System.out.println("");
    System.out.print("PILIHAN> ");

    try {
        int pilihan = Integer.parseInt(input.readLine());

        switch (pilihan) {
            case 0:
                System.exit(0);
                break;
            case 1:
                insertData();
                break;
            case 2:
                showData();
                break;
            case 3:
                updateData();
                break;
            case 4:
                deleteData();
                break;
            default:
                System.out.println("Pilihan salah!");
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}
static void showData() {
    String sql = "SELECT * FROM menu_makanan";
    try {
        rs = stmt.executeQuery(sql);
        
        System.out.println("+--------------------------------+");
        System.out.println("|    DATA MAKANAN                |");
        System.out.println("+--------------------------------+");
        while (rs.next()) {
            int kd_makanan = rs.getInt("kd_makanan");
            String menu_makanan = rs.getString("menu_makanan");
            String harga_makanan = rs.getString("harga_makanan");
            String menu_minuman = rs.getString("menu_minuman");
            String harga_minuman = rs.getString("harga_minuman");
            
            System.out.println(String.format("%d. %s -- (%s)", kd_makanan, menu_makanan, harga_makanan, menu_minuman, harga_minuman));
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}
static void insertData() {
    try {
        // ambil input dari user
        System.out.print("Masukkan Kd: ");
        int kd_makanan = Integer.parseInt(input.readLine());
        System.out.print("menu_makanan: ");
        String menu_makanan = input.readLine().trim();
        System.out.print("harga_makanan: ");
        String harga_makanan = input.readLine().trim();
         System.out.print("menu_minuman: ");
        String menu_minuman = input.readLine().trim();
         System.out.print("harga_minuman: ");
        String harga_minuman = input.readLine().trim();
        
        // query simpan
        String sql = "INSERT INTO menu_makanan (kd_makanan,menu_makanan, harga_makanan, menu_minuman, harga_minuman) VALUE('%d', '%s', '%s', '%s', '%s' )";
        sql = String.format(sql, kd_makanan,menu_makanan, harga_makanan, menu_minuman, harga_minuman);
        
        // simpan buku
        stmt.execute(sql);
        
    } catch (Exception e) {
        e.printStackTrace();
    }
}
static void updateData() {
    try {  
        // ambil input dari user
        System.out.print("KD yang mau diedit: ");
        int kd_makanan = Integer.parseInt(input.readLine());
        System.out.print("menu_makanan: ");
        String menu_makanan = input.readLine().trim();
        System.out.print("harga_makanan: ");
        String harga_makanan = input.readLine().trim();
        System.out.print("menu_minuman: ");
        String menu_minuman = input.readLine().trim();
        System.out.print("harga_minuman: ");
        String harga_minuman = input.readLine().trim();

        // query update
        String sql = "UPDATE menu_makanan SET menu_makanan='%s', harga_makanan='%s',menu_minuman='%s',harga_minuman='%s' WHERE kd_makanan=%d";
        sql = String.format(sql, menu_makanan, harga_makanan, menu_minuman, harga_minuman,kd_makanan);

        // update data buku
        stmt.execute(sql);
        
    } catch (Exception e) {
        e.printStackTrace();
    }
}
static void deleteData() {
    try {
        
        // ambil input dari user
        System.out.print("ID yang mau dihapus: ");
        int kd_makanan = Integer.parseInt(input.readLine());
        
        // buat query hapus
        String sql = String.format("DELETE FROM menu_makanan WHERE kd_makanan=%d", kd_makanan);
        // hapus data
        stmt.execute(sql);
        
        System.out.println("Data telah terhapus...");
    } catch (Exception e) {
        e.printStackTrace();
    }
}

}


