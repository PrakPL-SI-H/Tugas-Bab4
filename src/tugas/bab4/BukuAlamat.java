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
}
