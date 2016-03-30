package alamat;
import java.util.Scanner;
public class mainAlamat {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Alamat a = new Alamat("Indah Dwi Chyntia", "Setiabudi", "0888888888", "indah@yahoo.com");
        Alamat b = new Alamat();
        b.setNama("Muhammad Ridwan");
        b.setAlamat("Sigura-gura");
        b.setTelp("08123456789");
        b.setEmail("ridwanmuh@gmail.com");
        Alamat c = new Alamat();
        System.out.println("====================ISI DATA BUKU===================");
        System.out.print("Masukkan Nama       : ");
        String nama = in.nextLine();
        c.setNama(nama);
        System.out.print("Masukkan Alamat     : ");
        String alamat = in.nextLine();
        c.setAlamat(alamat);
        System.out.print("Masukkan No.Telp    : ");
        String notelp = in.next();
        c.setTelp(notelp);
        System.out.print("Masukkan E-mail     : ");
        String email = in.next();
        c.setEmail(email);
        System.out.println("----------------------------------------------------");
        System.out.println("                    BUKU ALAMAT                     ");
        System.out.println("----------------------------------------------------");
        System.out.println("Nama Mahasiswa      : " + a.getNama());
        System.out.println("Alamat              : " + a.getAlamat());
        System.out.println("No. Telepon         : " + a.getTelp());
        System.out.println("E-mail              : " + a.getEmail());
        System.out.println("----------------------------------------------------");
        System.out.println("Nama Mahasiswa      : " + b.getNama());
        System.out.println("Alamat              : " + b.getAlamat());
        System.out.println("No. Telepon         : " + b.getTelp());
        System.out.println("E-mail              : " + b.getEmail());
        System.out.println("----------------------------------------------------");
        System.out.println("Nama Mahasiswa      : " + c.getNama());
        System.out.println("Alamat              : " + c.getAlamat());
        System.out.println("No. Telepon         : " + c.getTelp());
        System.out.println("E-mail              : " + c.getEmail());
        System.out.println("----------------------------------------------------");
    }
}