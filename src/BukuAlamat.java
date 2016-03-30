package Encapsulation;
import java.util.Scanner;
public class BukuAlamat {
    private String nama;
    private String alamat;
    private String nomor;
    private String email;
    public BukuAlamat(String nama, String alamat, String nomor, String email) {
        this.nama = nama;
        this.alamat = alamat;
        this.nomor = nomor;
        this.email = email;
    }
    public BukuAlamat() {
        nama = "";
        alamat = "";
        email = "";
        nomor = "";
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public void setNomor(String nomor) {
        this.nomor = nomor;
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
    public String getNomor() {
        return nomor;
    }
    public String getEmail() {
        return email;
    }
    public void cetak() {
        System.out.println("Daftar Informasi Buku Alamat");
        System.out.println("Nama          : " + nama);
        System.out.println("Alamat        : " + alamat);
        System.out.println("Nomor telepon : " + nomor);
        System.out.println("Email         : " + email);
    }
    public void create() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan nama      : ");
        nama = input.nextLine();
        System.out.print("Masukan alamat    : ");
        alamat = input.nextLine();
        System.out.print("Masukan no.telepon: ");
        nomor = input.nextLine();
        System.out.print("Masukan email     : ");
        email = input.nextLine();
        System.out.println();
        }
    }