/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118068.latihan17.programtunjangan;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Satria Aji Putra
 * KELAS    : IF-2
 * NIM      : 10118068
 * Deskripsi Program : Membuat program untuk menghitung besar tunjangan bagi
 * karyawan yang sudah menikah
 */

public class PBO210118068Latihan17ProgramTunjangan {

    public static double gapok = 0;
    public static double tunjangan = 0;
    public static String status;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("===========Program Tunjangan===========");
        
        System.out.print("Berapa gaji pokok anda perbulan?: Rp. ");
        gapok = scanner.nextInt(); // input gapok
        
        System.out.print("Status Anda? (Menikah/Belum)\t: ");
        status = scanner.next().toLowerCase(); // input status
        
        if(status.equals("menikah"))
            tunjangan = gapok*0.35;
        
        System.out.println("\n========Hasil Perhitungan Gaji Anda========");
        System.out.println("Gaji Pokok\t\t\t: Rp. " + gapok);
        System.out.println("Tunjangan\t\t\t: Rp. " + tunjangan);
        System.out.println("Total Gaji\t\t\t: Rp. " + (gapok+tunjangan));
        System.out.println("(Developed by: Satria Aji Putra)");
    }
    
}
