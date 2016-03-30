import java.util.Scanner;
class Buku{
    private String nama;
    private String alamat;
    private String nomerTelp;
    private String email;
    public void setNama(String nama){
        this.nama =" ";
        this.nama = nama;
    }
    public void setAlamat(String alamat){
        this.alamat = "";
        this.alamat = alamat;
    }
    public void setNoTelp(String nomerTelp){
        this.nomerTelp = "";
        this.nomerTelp = nomerTelp;
    }
    public void setEmail(String email){
        this.email =  "";
        this.email = email;
    }
    public String getNama(){
        return nama;
    }
    public String getAlamat(){
        return alamat;
    }
    public String getNoTelp(){
        return nomerTelp;
    }
    public String getEmail(){
        return email;
    }
}
public class LatihanBab4 {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       Buku[] Data = new Buku[5];
       for (int i=0; i<Data.length;i++){
           Data[i] = new Buku();
       }
        for (int i = 0; i < Data.length; i++) {
            System.out.println("------=======Data Diri=======------");
            System.out.print("Masukkan Nama   : "                     );
            Data[i].setNama(in.next());
            System.out.print("Masukkan Alamat : "                     );
            Data[i].setAlamat(in.next());
            System.out.print("Masukkan No.Telp: "                     );
            Data[i].setNoTelp(in.next());
            System.out.print("Masukkan Email  : "                     );
            Data[i].setEmail(in.next());  
        }
        System.out.println("--------------------============================Private Address Book=====================-----------------------");
        System.out.println("        NAMA              |         ALAMAT        |           NO CONTACT        |            EMAIL          |");    
        for (int i = 0; i < Data.length; i++) {                      
            System.out.print(Data[i].getNama()+"                            ");
            System.out.print(Data[i].getAlamat()+"                          ");
            System.out.print(Data[i].getNoTelp()+"      ");
            System.out.println(Data[i].getEmail()+"     ");
            System.out.println("=============================================================================================================");
        }
    }
}
  