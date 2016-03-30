package tugas.bab4;

import java.util.Scanner;

public class TugasBab4 {

    public static int indeks;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BukuAlamat data = new BukuAlamat(1);
        int pilih;
        do {
            System.out.println("\tBUKU ALAMAT");
            System.out.println("1. Isi Data");
            System.out.println("2. Lihat Data");
            System.out.println("0. Keluar");
            System.out.print("Masukan Pilihan = ");
            pilih = in.nextInt();
            System.out.println("-------------------------------------");
            switch (pilih) {
                case 1:
                    System.out.println("\tIsi Data");
                    System.out.print("Masukan Banyaknya Data = ");
                    indeks = in.nextInt();
                    in.nextLine();
                    data = new BukuAlamat(indeks);
                    System.out.println("-------------------------------------");
                    for (int i = 0; i < indeks; i++) {
                        System.out.print("Masukan Nama          = ");
                        data.setNama(in.nextLine(), i);
                        System.out.print("Masukan Alamat        = ");
                        data.setAlamat(in.nextLine(), i);
                        System.out.print("Masukan Nomor Telpon  = ");
                        data.setNoTel(in.nextLine(), i);
                        System.out.print("Masukan Alamat E-mail = ");
                        data.setEmail(in.nextLine(), i);
                        System.out.println("-------------------------------------");
                    }
                    break;
                case 2:
                    System.out.println("\tLihat Data");
                    for (int i = 0; i < indeks; i++) {
                        System.out.println("Nama          =  " + data.getNama(i));
                        System.out.println("Alamat        =  " + data.getAlamat(i));
                        System.out.println("Nomor Telepon =  " + data.getNoTel(i));
                        System.out.println("Alamat E-mail =  " + data.getEmail(i));
                        System.out.println("-------------------------------------");
                    }
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
