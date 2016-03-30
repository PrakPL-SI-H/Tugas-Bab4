package Bab4;
import java.util.Scanner;
public class MainBuku {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        Buku data1 = new Buku ("Muna Syahida", "Jl Bendungan Sigura-gura Barat 1A", "085678823662", "munasyahida@gmail.com");
        Buku data2 = new Buku ("Weni Gusti Rahayu", "Jl Terusan Cikampek no 1", "081238477732", "wenigr97@gmail.com");
        Buku data3 = new Buku ("Nanda Fiesta Farada", "Jl Sunan Kalijaga 1 no 11", "085658450300", "nandafiestafarada@gmail.com");
        Buku data4 = new Buku ();
        Buku data5 = new Buku ();
        data4.setNama("Dyah Arifiani Situmorang");
        data4.setAlamat("Jl Kerto Pamuji no 24");
        data4.setNomorTelepon("085745834500");
        data4.setAlamtEmail("dyahas@gmail.com");
        System.out.println("Data 1");
        data1.showData();
        System.out.println("==================================================");
        System.out.println("Data 2");
        data2.showData();
        System.out.println("==================================================");
        System.out.println("Data 3");
        data3.showData();
        System.out.println("==================================================");
        System.out.println("Data 4");
        System.out.println("Nama Lengkap\t: " + data4.getNama());
        System.out.println("Alamat Lengkap\t: " + data4.getAlamat());
        System.out.println("Nomor Telepon\t: " + data4.getNomorTelepon());
        System.out.println("Alamat Email\t: " + data4.getAlamatEmail());
        System.out.println("==================================================");
        System.out.println("Data 5");
        System.out.print("Nama Lengkap\t: ");
        data5.setNama(in.nextLine());
        System.out.print("Alamat Lengkap\t: ");
        data5.setAlamat(in.nextLine());
        System.out.print("Nomor Telepon\t: ");
        data5.setNomorTelepon(in.nextLine());
        System.out.print("Alamat Email\t: ");
        data5.setAlamtEmail(in.nextLine());
        System.out.println("==================================================");
    }
}
