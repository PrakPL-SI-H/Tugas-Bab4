package javaapplication10;

import java.util.Scanner;

public class mainDataDiri {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DataDiri user[] = new DataDiri[5];

        for (int i = 0; i < user.length; i++) {
            user[i] = new DataDiri();
        }
        System.out.println(" PROGRAM INPUTAN BUKU ALAMAT");
        System.out.println(" ============================");

        System.out.print("Berapa user yang ingin anda masukkan : ");

        int jumlahUser = in.nextInt();
        for (int i = 0; i < jumlahUser; i++) {
            System.out.println("================================");
            System.out.println("Silahkan Masukkan Data Diri Anda");
            System.out.println("================================");
            System.out.print("Masukkan Nama   : ");
            user[i].setNamaLengkap(in.next());
            System.out.print("Masukkan Alamat : ");
            user[i].setAlamat(in.next());
            System.out.print("Masukkan No.Telp: ");
            user[i].setNoTelepon(in.next());
            System.out.print("Masukkan Email  : ");
            user[i].setEmail(in.next());
        }

        for (int i = 0; i < jumlahUser; i++) {
            System.out.println("======BUKU ALAMAT======");
            System.out.println("NAMA        : " + user[i].getNamaLengkap());
            System.out.println("ALAMAT      : " + user[i].getAlamat());
            System.out.println("NO.TELP/HP  : " + user[i].getNoTelepon());
            System.out.println("EMAIL       : " + user[i].getEmail());
            System.out.println("=====================================");

        }
        System.out.println("TERIMAKASIH ATAS PATAS PARTISIPASINYA");
    }
}
