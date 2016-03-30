package javaapplication10;

import java.util.Scanner;

public class mainDataDiri {

    public static void main(String[] args) {
        /**
         * DataDiri b1 = new DataDiri(); 
         * b1.setNamaLengkap("Ghifari Galih
         * Ramadhan"); 
         * b1.setAlamat("Sir Matt Busby Way, Manchester");
         * b1.setNoTelepon("085646355141"); 
         * b1.setEmail("ghifari.gr@gmail.com");
           b1.DisplayMessage();
         */

        Scanner in = new Scanner(System.in);
        DataDiri user = new DataDiri();

        System.out.println(" PROGRAM INPUTAN BUKU ALAMAT");
        System.out.println(" ============================");
        System.out.println("Silahkan Masukkan Data Diri Anda");
        System.out.println("================================");
        System.out.print("Masukkan Nama   : ");
        user.setNamaLengkap(in.next());
        System.out.print("Masukkan Alamat : ");
        user.setAlamat(in.next());
        System.out.print("Masukkan No.Telp: ");
        user.setNoTelepon(in.next());
        System.out.print("Masukkan Email  : ");
        user.setEmail(in.next());

        System.out.println("======BUKU ALAMAT======");
        System.out.println("NAMA        : " + user.getNamaLengkap());
        System.out.println("ALAMAT      : " + user.getAlamat());
        System.out.println("NO.TELP/HP  : " + user.getNoTelepon());
        System.out.println("EMAIL       : " + user.getEmail());
        System.out.println("=====================================");
        System.out.println("TERIMAKASIH ATAS PATAS PARTISIPASINYA");
    }

}
