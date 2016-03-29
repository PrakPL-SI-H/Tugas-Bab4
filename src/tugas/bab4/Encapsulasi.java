
package mainencapsulasi;

public class Encapsulasi {
    private String nama, alamat, telp, email;
    
    public Encapsulasi(){
        
    }
    public Encapsulasi(String a, String b, String c, String d){
        nama = a;
        alamat = b;
        telp = c;
        email = d;
    }
    
    public void setNama(String a){
        nama = a;
    }
    public void setAlamat(String b){
        alamat = b;
    }
    public void setTelp(String c){
        telp = c;
    }
    public void setEmail(String d){
        email = d;
    }
    
    public String getNama(){
        return nama;
    }
    public String getAlamat(){
        return alamat;
    }
    public String getTelp(){
        return telp;
    }
    public String getEmail(){
        return email;
    }
}
