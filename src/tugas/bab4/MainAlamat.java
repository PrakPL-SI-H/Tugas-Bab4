package pratikum4;
import java.util.Scanner;
public class MainAlamat {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        BukuAlamat z1 = new BukuAlamat();
        BukuAlamat z2 = new BukuAlamat();
        System.out.print("Masukkan nama 1          : ");
        z1.setNama(in.nextLine());
        System.out.print("Masukkan alamat 1        : ");
        z1.setAlamat(in.nextLine());
        System.out.print("Masukkan nomor telepon 1 : ");
        z1.setNotel(in.next());
        System.out.print("Masukkan alamat e-mail 1 : ");
        z1.setEmail(in.next());
        
        System.out.println("-----------------------------");
        
        System.out.print("Masukkan nama 2          : ");
        in.nextLine();
        z2.setNama(in.nextLine());
        System.out.print("Masukkan alamat 2        : ");
        z2.setAlamat(in.nextLine());
        System.out.print("Masukkan nomor telepon 2 : ");
        z2.setNotel(in.next());
        System.out.print("Masukkan alamat e-mail 2 : ");
        z2.setEmail(in.next());
        System.out.println("-----------------------------");
        z1.drome();
        z2.drome();
    }
    
}
