
import java.util.Scanner;

public class PraktikumEnkapsulasiMain {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PraktikumEnkapsulasi yee = new PraktikumEnkapsulasi();
        String nama;
        int dat;
        do {
            System.out.println("===============>>>SELAMAT DATANG DI BUKU ALAMAT<<<================");
            System.out.println("1. Mencari Data");
            System.out.println("2. Keluar");
            System.out.print("Masukkan pilihan anda: ");
            dat = in.nextInt();
            if (dat == 1) {
                System.out.print("Masukkan nama data yang ingin dicari: ");
                nama = in.next();

                if ("Lasma".equals(nama) || "lasma".equals(nama)) {
                    yee.lasma();
                } else if ("Naurah".equals(nama) || "naurah".equals(nama)) {
                    yee.nauroh();
                } else if ("Aulia".equals(nama) || "aulia".equals(nama)) {
                    yee.aulia();
                } else {
                    System.out.println("Data yang anda masukkan salah!");
                }
            } else if (dat == 2) {
                System.exit(0);
            } else {
                System.out.println("Data yang anda masukkan salah!");
            }
        } while (dat != 0);

    }
}
