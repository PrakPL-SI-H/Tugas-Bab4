package pratikum4;
import java.util.Scanner;
public class MainAlamat {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        BukuAlamat z1 = new BukuAlamat();
        BukuAlamat z2 = new BukuAlamat();
        System.out.println("Masukkan nama 1 : ");
        z1.setNama(in.nextLine());
        System.out.println("Masukkan alamat 1 : ");
        z1.setAlamat(in.nextLine());
        System.out.println("Masukkan nomor telepon 1 : ");
        z1.setNotel(in.next());
        System.out.println("Masukkan alamat e-mail 1 : ");
        z1.setEmail(in.next());
    }
    
}
