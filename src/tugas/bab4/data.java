import java.util.Scanner;
public class data{
public static String nama;
private String alamat;
private String notlp;
private String email;
Scanner ini = new Scanner(System.in);
    public data(String nama){ //CONSTRUCTOR
        this.nama = nama;
    }
    public String getAlamat(){  //ACCESSOR
        return alamat;
    }
    public void setAlamat(String temp){ //MUTATOR
        alamat = temp;
    }
    public String getNotelp (){ //ACCESSOR
        return notlp;
    }
    public void setNotelp (String temp){ //MUTATOR
        notlp = temp;
    }
    public String getEmail(){ //ACCESSOR
        return email;
    }
    public void setEmail(String temp){  //MUTATOR
        email = temp;
    }
    public void tampilkan(){
        System.out.println("++++++++ Buku Telpon ++++++++");
        System.out.println("Nama : "+nama); //dari constructor
        System.out.println("Alamat : "+getAlamat());
        System.out.println("Nomor telp : "+getNotelp());
        System.out.println("Email : "+getEmail());
    }
}