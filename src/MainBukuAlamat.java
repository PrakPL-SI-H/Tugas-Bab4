package PraktikumSIH;
import java.util.Scanner;
public class MainBukuAlamat {
    public static void main(String[] args) {
        BukuAlamat data = new BukuAlamat();
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Data : ");
        int kapasitas = in.nextInt();
        System.out.println();
        for (int i = 0; i < kapasitas; i++) {
            System.out.println("DATA KE-" + (i+1));
            System.out.print("Nama Lengkap Anda     : ");
            String nama = in.next();
            data.getNama();
            System.out.print("Alamat Lengkap Anda   : ");
            String alamat = in.next();
            data.getAlamat();
            System.out.print("Nomor Telepon Anda    : ");
            String noTelp = in.next();
            data.getNoTelp();
            System.out.print("Alamat Email  Anda    : ");
            String alamatEmail = in.next();
            data.getAlamatEmail();
            data.displaybukuAlamat(nama, alamat, noTelp, alamatEmail);
        }
    }
}