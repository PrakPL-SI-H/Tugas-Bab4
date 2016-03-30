package tugas.bab4;

import java.util.Scanner;

public class MainBukuAlamat {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BukuAlamat buku = new BukuAlamat();
        int data, exit;
        do {
            exit = 0;
            data = 0;
            System.out.print("\nMasukkan nama : ");
            String nama = in.nextLine();
            for (int i = 0; i < 5; i++) {
                if (buku.getNama(i).equalsIgnoreCase(nama)) {
                    System.out.println(buku.getNama(i));
                    System.out.println(buku.getAlamat(i));
                    System.out.println(buku.getNotel(i));
                    System.out.println(buku.getEmail(i));
                    data++;
                }
            }
            if (data == 0) {
                System.out.println("Data Tidak Ditemukan");
            }
            System.out.print("Apakah anda ingin melanjutkan pencarian?[Y/N]: ");
            String put = in.next();
            if (put.equalsIgnoreCase("n")) {
                exit = 1;
            }
            in.nextLine();
        } while (exit != 1);
    }
}
