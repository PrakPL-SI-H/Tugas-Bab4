
import java.util.Scanner;
public class MainData {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        Data user = new Data();
        
        System.out.print("Masukkan Nama : ");
        user.setNama(in.nextLine());
        System.out.print("Masukkan Alamat : ");
        user.setAlamat(in.nextLine());
        System.out.print("Masukkan Nomor Telepon : ");
        user.setNotelepon(in.nextLine());
        System.out.print("Masukkan Alamat E-mail : ");
        user.setEmail(in.nextLine());
        user.displayMessage();
    }
    
}
