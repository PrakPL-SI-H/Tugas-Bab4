package tugas.bab4;

import java.util.Scanner;

public class TugasBab4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BukuAlamat data = new BukuAlamat();
        int pilih;
        do {
            System.out.println("\tBUKU ALAMAT");
            System.out.println("1. Isi Data");
            System.out.println("2. Lihat Data");
            System.out.println("0. Keluar");
            System.out.print("Masukan Pilihan = ");
            pilih = in.nextInt();
            System.out.println("-------------------------------------");
            in.nextLine();
            switch (pilih) {
                case 1:
                    System.out.println("\tIsi Data");
                    System.out.print("Masukan Nama          = ");
                    data.setNama(in.nextLine());
                    System.out.print("Masukan Alamat        = ");
                    data.setAlamat(in.nextLine());
                    System.out.print("Masukan Nomor Telpon  = ");
                    data.setNoTel(in.nextLine());
                    System.out.print("Masukan Alamat E-mail = ");
                    data.setEmail(in.nextLine());
                    System.out.println("-------------------------------------");
                    break;
                case 2:
                    System.out.println("\tLihat Data");
                    data.showData();
                    System.out.println("-------------------------------------");
                    break;
                default:
                    if (pilih == 0) {
                        break;
                    } else {
                        System.out.println("Maaf, Pilihan Tidak Tersedia");
                    }
            }
        } while (pilih != 0);
        System.out.println("\tTerima Kasih");
    }
}
