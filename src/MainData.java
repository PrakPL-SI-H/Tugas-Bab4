
import java.util.Scanner;

public class MainData {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Data[] user = new Data [100];
        int i = 0;
        char pil;

        do {
            user[i] = new Data();
             System.out.println("==========================================================");
            System.out.println("\t\tPendataan Buku Alamat");
            System.out.println("==========================================================\n");
            System.out.print("Masukkan Nama          : ");
            user[i].setNama(in.nextLine());
            System.out.print("Masukkan Alamat        : ");
            user[i].setAlamat(in.nextLine());
            System.out.print("Masukkan Nomor Telepon : ");
            user[i].setNotelepon(in.nextLine());
            System.out.print("Masukkan Alamat E-mail : ");
            user[i].setEmail(in.nextLine());
            i++;
            System.out.println("Apakah anda mau mendata lagi? (y/t)");
            System.out.print("Pilihan Anda : ");
            pil = in.next().toUpperCase().charAt(0);
            in.nextLine();
            if (pil == 'T') {
                for (int x =0 ; x<i;x++){
                    user[x].displayMessage(x);
                }
            }
        } while (pil != 'T');
    }

}
