
import java.util.Scanner;

public class BukuAlamat{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        String pilih;
        System.out.println("Masukkan Nama : ");
        String nama = in.nextLine();
        if("Prasetyo".equals(nama)){
        data a = new data("Prasetyo");
        a.setAlamat("Pasuruan");
        a.setNotelp("089660705147");
        a.setEmail("tiyo17@yahoo.co.id");
        a.tampilkan();
        }else if("Wibisono".equals(nama)){
        data b = new data("Wibisono");
        b.setAlamat("Malang");
        b.setNotelp("089660795354");
        b.setEmail("wibi67@yahoo.co.id");
        b.tampilkan();
        }else
        System.out.println("Nama yang anda masukkan salah");
    }
}