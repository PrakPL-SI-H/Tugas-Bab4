
import java.util.Scanner;

public class MainBukuAlamat {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean keluar = false;
        BukuAlamat data[] = new BukuAlamat[10];
        for (int i = 0; i < data.length; i++) {
            data[i] = new BukuAlamat();
        }
        System.out.println("Selamat datang di Informasi Buku Alamat,");
        do {
            System.out.println("----------------");
            System.out.println("<Menu Informasi>");
            System.out.println("1] Cari Data Anggota");
            System.out.println("2] Tambah Data Anggota");
            System.out.println("9] Keluar");
            System.out.print("Input menu: ");
            switch (in.nextInt()) {
                case 1:
                    System.out.print("Cari Nama Anggota: ");
                    String cari = in.next();
                    for (int i = 0; i < data.length; i++) {
                        if (data[i].getNama() == null) {
                            System.out.println("Maaf, data tidak ditemukan");
                            break;
                        } else if (cari.equalsIgnoreCase(data[i].getNama())) {
                            System.out.println("Nama\t: " + data[i].getNama());
                            System.out.println("Alamat\t: " + data[i].getAlamat());
                            System.out.println("No Telp\t: " + data[i].getNoTelp());
                            System.out.println("e-mail\t: " + data[i].getEmail());
                            break;
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < data.length; i++) {
                        if (data[i].getNama() != null) {
                            continue;
                        } else {
                            System.out.println("Isi Biodata Anggota Baru");
                            System.out.print("Input Nama\t: ");
                            data[i].setNama(in.next());
                            System.out.print("Input Alamat\t: ");
                            data[i].setAlamat(in.next());
                            System.out.print("Input No Telp\t: ");
                            data[i].setNoTelp(in.next());
                            System.out.print("Input e-mail\t: ");
                            data[i].setEmail(in.next());
                            System.out.println("Data telah disimpan...");
                        }
                        break;
                    }
                    break;
                case 9:
                    System.out.println("Terima kasih sampai jumpa...");
                    keluar = true;
                    break;
                default:
                    System.out.println("Maaf, input Anda salah. Silahkan ulangi");
                    break;
            }
        } while (keluar == false);
    }
}

