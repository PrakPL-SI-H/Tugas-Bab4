package PrakPemLan;

import java.util.Scanner;

public class Info_BukuAlamat {

    public static void main(String[] args) {
        BukuAlamat data = new BukuAlamat(" ");
        Scanner in = new Scanner(System.in);
        
        System.out.println("__________DATA-DATA PADA BUKU ALAMAT__________");
        System.out.print("\nMasukkan nama lengkap Anda : ");
        String n = in.nextLine();
        System.out.print("Masukkan alamat lengkap Anda : ");
        data.setAddress(in.next());
        System.out.print("Masukkan nomor telepon personal Anda : ");
        data.setPhoneNumber(in.next());
        System.out.print("Masukkan alamat e-mail personal Anda : ");
        data.setEmailAddress(in.next());
        System.out.println();
        data.PrintData();
    }
}