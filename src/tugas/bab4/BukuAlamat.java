package pratikum4;

public class BukuAlamat {
    private String nama, alamat, notel, email;
    public BukuAlamat(){
        alamat = "";
        notel = "";
    }
    public BukuAlamat(String a, String b, String c, String d){
        nama = a;
        alamat = b;
        notel = c;
        email = d;
    }
    public void  setNama(String a){
        nama = a;
    }
    public String getNama(){
        return nama;
    }
   public void  setAlamat(String b){
        alamat = b;
    }
    public String getAlamat(){
        return alamat;
    }
    public void  setNotel(String c){
        notel = c;
    }
    public String getNotel(){
        return notel;
    }
    public void  setEmail(String d){
        email = d;
    }
    public String getEmail(){
        return email;
    }
    public void drome(){
        System.out.println("NAMA            :"+getNama());
        System.out.println("ALAMAT          :"+getAlamat());
        System.out.println("NOMOR TELEPON   :"+getNotel());
        System.out.println("ALAMAT E-MAIL   :"+getEmail());
        System.out.println("================================");
    }
}
