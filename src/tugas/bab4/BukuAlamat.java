import java.util.Scanner;
public class BukuAlamat{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        String pilih;
        do{
        System.out.println("=====================");    
        System.out.println("Daftar Buku Telephone");
        System.out.println("=====================");
        System.out.println("Andi");
        System.out.println("Anton");
        System.out.println("Metha");
        System.out.println("Prasetyo");
        System.out.println("Sembiring");
        System.out.println("Wibisono");
        System.out.println("=====================");
        System.out.println("Untuk melihat detail" );
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
        }else if("Anton".equals(nama)){
        data d = new data("Anton");
        d.setAlamat("Surabaya");
        d.setNotelp("089660705147");
        d.setEmail("Anton@yahoo.co.id");
        d.tampilkan();
        }else if("Andi".equals(nama)){
        data e = new data("Andi");
        e.setAlamat("Banyuwangi");
        e.setNotelp("089654395354");
        e.setEmail("And1@yahoo.co.id");
        e.tampilkan();
        }else if("Sembiring".equals(nama)){
        data f = new data("Sembiring");
        f.setAlamat("Medan");
        f.setNotelp("089660704657");
        f.setEmail("Sembir86@yahoo.co.id");
        f.tampilkan();
        }else if("Metha".equals(nama)){
        data g = new data("Metha");
        g.setAlamat("Pemalang");
        g.setNotelp("089660132354");
        g.setEmail("metha7@yahoo.co.id");
        g.tampilkan();
        }else
        System.out.println("Nama yang anda masukkan salah");
    System.out.println("Anda ingin mengulang (ya/tidak) : ");
    pilih = in.nextLine();
    }while(!"tidak".equals(pilih));
    System.out.println("Terima Kasih Sudah Mencoba");
    }
}