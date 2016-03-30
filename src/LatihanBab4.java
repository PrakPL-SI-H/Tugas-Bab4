/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author irwin deriyan
 */
import java.util.Scanner;
public class BukuAlamat {
    private String nama, alamat, notel, email;
    public BukuAlamat(int i) {
    }
    public BukuAlamat() {
    }
    public void setNama(String n) {
        this.nama = n;
    }
    public String getNama() {
        return nama;
    }
    public void setAlamat(String a) {
        this.alamat = a;
    }
    public String getAlamat() {
        return alamat;
    }
    public void setNotel(String nt) {
        this.notel = nt;
    }
    public String getNotel() {
        return notel;
    }
    public void setEmail(String e) {
        this.email = e;
    }
    public String getEmail() {
        return email;
    }
}
class MainAlamat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah orang yang akan input data = ");
        int p = input.nextInt();
        BukuAlamat ba[] = new BukuAlamat[p];
        for (int i = 0; i < ba.length; i++) {
            ba[i] = new BukuAlamat();
            System.out.print("Masukkan Nama = ");
            ba[i].setNama(input.next());
            System.out.print("Masukkan Alamat = ");
            ba[i].setAlamat(input.next());
            System.out.print("Masukkan Nomer Telepon = ");
            ba[i].setNotel(input.next());
            System.out.print("Masukkan E-mail = ");
            ba[i].setEmail(input.next());
            System.out.println();
        }
        for (int i = 0; i < ba.length; i++) {
            System.out.println("Nama = " + ba[i].getNama());
            System.out.println("Alamat = " + ba[i].getAlamat());
            System.out.println("Nomer Telepon =" + ba[i].getNotel());
            System.out.println("E-mail = " + ba[i].getEmail());
            System.out.println();
        }
    }
}
 
