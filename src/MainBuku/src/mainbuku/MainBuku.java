package mainbuku;

import java.util.Scanner;

public class MainBuku {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (;;) {
            System.out.println("");
            System.out.println("============================");
            System.out.println(">> Menu Data Buku Alamat <<");
            System.out.println("1. Memasukkan Data ");
            System.out.println("2. Edit Data");
            System.out.println("3. Melihat Data ");
            System.out.println("4. Exit ");
            System.out.print("Masukkan Pilihan : ");
            int pil = in.nextInt();
            switch (pil) {
                case 1:
                    System.out.print("Masukkan Nama : ");
                    String nama = in.next();
                    System.out.print("Masukkan Alamat : ");
                    String alamat = in.next();
                    System.out.print("Masukkan No Telp. : ");
                    int no = in.nextInt();
                    System.out.print("Masukkan Email : ");
                    String email = in.next();
                    DataBuku data = new DataBuku(nama, alamat, no, email);
                    break;
                case 2:
                    DataBuku data2 = new DataBuku();
                    System.out.println("Apa yang ingin anda edit ?");
                    System.out.println("1. Nama ");
                    System.out.println("2. Alamat ");
                    System.out.println("3. No. Telp ");
                    System.out.println("4. Email ");
                    System.out.print("Masukkan pilihan : ");
                    int pil2 = in.nextInt();
                    switch (pil2) {
                        case 1:
                            System.out.println("Masukkan nama baru : ");
                            data2.setNama(in.next());
                            break;
                        case 2:
                            System.out.println("Masukkan alamat baru : ");
                            data2.setAlamat(in.next());
                            break;
                        case 3:
                            System.out.println("Masukkan No. Telp baru : ");
                            data2.setTelp(in.nextInt());
                            break;
                        case 4:
                            System.out.println("Masukkan Email baru : ");
                            data2.setEmail(in.next());
                            break;
                        default:
                            System.out.println("Masukkan anda salah,Piliahan tidak tersedia"
                                    + " Pilih Edit Data lagi sekali lagi");
                            break;

                    }
                    break;
                case 3:
                    DataBuku data3 = new DataBuku();
                    System.out.println("||    >>Tabel Data Buku Alamat<<  ");
                    System.out.println("=========================================");
                    System.out.println("||    Nama     : " + data3.getNama());
                    System.out.println("||    Alamat   : " + data3.getAlamat());
                    System.out.println("||    NO. Telp : " + data3.getTelp());
                    System.out.println("||    Email    : " + data3.getEmail());
                    System.out.println("=========================================");
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Masukan anda tidak sesuai nomor");

            }
        }
    }

}
