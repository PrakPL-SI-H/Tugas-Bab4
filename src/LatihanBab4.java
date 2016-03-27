import java.util.Scanner;
class Buku{
    private String nama;
    private String alamat;
    private String nomerTelp;
    private String email;
    public Buku(){
        this.nama = "";
        this.alamat = "";
        this.nomerTelp = "";
        this.email =  "";
    }
    public void setName(String nama){
        this.nama = nama;
    }
    public void setAddress(String alamat){
        this.alamat = alamat;
    }
    public void setNumber(String nomerTelp){
        this.nomerTelp = nomerTelp;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getName(){
        return nama;
    }
    public String getAddress(){
        return alamat;
    }
    public String getNumber(){
        return nomerTelp;
    }
    public String getEmail(){
        return email;
    }
}
public class LatihanBab4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Buku[] user = new Buku[5];
        for (int i = 0; i < user.length; i++) {
            user[i]= new Buku();   
        }
        for (int i = 0; i < user.length; i++) {
            System.out.println("===========================");
            System.out.print("Masukkan Nama   : ");
            user[i].setName(in.next());
            System.out.print("Masukkan Alamat : ");
            user[i].setAddress(in.next());
            System.out.print("Masukkan No.Telp: ");
            user[i].setNumber(in.next());
            System.out.print("Masukkan Email  : ");
            user[i].setEmail(in.next());  
        }
        for (int i = 0; i < user.length; i++) {
            System.out.println("======ADDRESS BOOK======");
            System.out.println("NAMA        : "+user[i].getName());
            System.out.println("ALAMAT      : "+user[i].getAddress());
            System.out.println("NO.TELP/HP  : "+user[i].getNumber());
            System.out.println("EMAIL       : "+user[i].getEmail());
        }
    }
    
}
