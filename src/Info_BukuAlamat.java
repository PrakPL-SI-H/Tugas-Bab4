package PrakPemLan;

import java.util.Scanner;

public class Info_BukuAlamat {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BukuAlamat buku = new BukuAlamat();
        int pil, jlh = 0;
        System.out.println("########################################");
        System.out.println("\tDATA-DATA PADA BUKU ALAMAT");
        System.out.println("########################################");
        do {
            System.out.println();
            System.out.println("\t\tMENU");
            System.out.println("1. ISI DATA");
            System.out.println("2. TAMBAH DATA");
            System.out.println("3. KELUAR");
            System.out.println();
            System.out.print("Pilih menu : ");
            pil = in.nextInt();
            switch (pil) {
                case 1:
                    System.out.println("################################");
                    System.out.print("Banyak data yang ingin diinputkan : ");
                    jlh = in.nextInt();
                    for (int i = 0; i < jlh; i++) {
                        System.out.println("Data ke- " + (i + 1));
                        System.out.print(("Masukkan nama lengkap\t: "));
                        BukuAlamat.nama[i] = in.next();
                        System.out.print(("Masukkan alamat\t\t: "));
                        BukuAlamat.alamat[i] = in.next();
                        System.out.print(("Masukkan nomor telepon\t: "));
                        BukuAlamat.notelp[i] = in.next();
                        System.out.print(("Masukkan alamat email\t: "));
                        BukuAlamat.email[i] = in.next();
                        System.out.println();
                    }
                    for (int i = 0; i < jlh; i++) {
                        buku.display();
                    }
                    break;
                case 2:
                    System.out.println("\tTAMBAH DATA");
                    System.out.println("################################");
                    System.out.print("Banyak data yang ingin diinputkan : ");
                    jlh = in.nextInt();
                    for (int i = 0; i < jlh; i++) {
                        System.out.println("Data ke- " + (i + 1));
                        System.out.print(("Masukkan nama lengkap\t: "));
                        BukuAlamat.nama[i] = in.next();
                        System.out.print(("Masukkan alamat\t\t: "));
                        BukuAlamat.alamat[i] = in.next();
                        System.out.print(("Masukkan nomor telepon\t: "));
                        BukuAlamat.notelp[i] = in.next();
                        System.out.print(("Masukkan alamat email\t: "));
                        BukuAlamat.email[i] = in.next();
                        System.out.println();
                    }
                    System.out.println("Data tersimpan dengan baik.");
                    break;
                case 3:
                    System.out.println("# TERIMA KASIH TELAH MENGGUNAKAN PROGRAM INI #");
                    System.exit(3);
            }
        } while (pil != 3);
    }
}