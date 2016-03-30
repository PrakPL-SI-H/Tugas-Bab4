package mainbuku;

import java.util.Scanner;

public class MainBuku {

    public static void main(String[] args) {
            Scanner in  = new Scanner (System.in);
           
            System.out.println(">> Tabel Data Buku Alamat <<");
            System.out.println("1. Memasukkan Data ");
            System.out.println("2. Edit Data");
            System.out.println("3. Melihat Data ");
            System.out.println("Masukkan Pilihan : ");
            int pil = in.nextInt();
            switch (pil){
                case 1 : System.out.print("Masukkan Nama : ");
                         String nama = in.next();
                         System.out.print("Masukkan Alamat : ");
                         String alamat = in.next();
                         System.out.print("Masukkan No Telp. : ");
                         int no = in.nextInt();
                         System.out.print("Masukkan Email : ");
                         String email = in.next();
                         DataBuku data = new DataBuku (nama,alamat,no,email);
            }
            
    }

}
