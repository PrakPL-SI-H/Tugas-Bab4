import java.util.Scanner;
public class BukuAlamat {

    public String nama, alamat, nomortel, email;
public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setNomortel(String nomortel) {
        this.nomortel = nomortel;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNomortel() {
        return nomortel;
    }

    public String getEmail() {
        return email;
    }

public void DisplayMessage() {
        System.out.println("======================");
        System.out.println("Nama anda : " + getNama());
        System.out.println("Alama anda : " + getAlamat());
        System.out.println("Nomor telepon anda :" + getNomortel());
        System.out.println("Email anda : " + getEmail());
    }

}

class MainBukuAlamat{
public static void main(String args[]){
BukuAlamat ba = new BukuAlamat();
Scanner input = new Scanner(System.in);
System.out.println("===Buku Alamat===");
System.out.print("Masukkan nama : ");
String nama = input.nextLine();
ba.setNama(nama);
System.out.print("Masukkan alamat anda : ");
String alamat = input.nextLine();
ba.setAlamat(alamat);
System.out.print("Masukkan nomor telepon anda : ");
String notel = input.nextLine();
ba.setNomortel(notel);
System.out.print("Masukkan alamat email anda : ");
String email = input.nextLine();
ba.setEmail(email);
ba.DisplayMessage();
}
}
