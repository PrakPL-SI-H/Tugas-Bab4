
import java.util.Scanner;

class Alamat {

    Scanner input = new Scanner(System.in);
    private String nama;
    private String alamat;
    private String noTelepon;
    private String alamatEmail;

    public Alamat() {
        nama = " ";
        alamat = " ";
        noTelepon = " ";
        alamatEmail = " ";
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNoTelepon() {
        return noTelepon;
    }

    public void setNoTelepon(String noTelepon) {
        this.noTelepon = noTelepon;
    }

    public String getAlamatEmail() {
        return alamatEmail;
    }

    public void masukan() {
        System.out.print("--> Masukkan Jumlah Data : ");
        int kapasitas = input.nextInt();
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("             PENGISIAN DATA DIMULAI             ");
        System.out.println();
        for (int i = 0; i < kapasitas; i++) {
            System.out.print("-->> Nama Lengkap Anda : ");
            nama = input.next();
            System.out.print("==>> Alamat lengkap Anda : ");
            alamat = input.next();
            System.out.print("-->> Nomer Telepon : ");
            noTelepon = input.next();
            System.out.print("==>> Alamat Email : ");
            alamatEmail = input.next();
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
            System.out.println();
        }
    }
}

class LatihanBab1 {

    public static void main(String[] args) {
        System.out.println("tess");

    }

}
