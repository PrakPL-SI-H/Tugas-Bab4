package alamat;
public class Alamat {
    private String nama, alamat, email, telp;    
    public Alamat(){        
    }
    public Alamat(String nama, String alamat, String telp, String email) {
        this.nama = nama;
        this.alamat = alamat;
        this.telp = telp;
        this.email = email;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public String getAlamat() {
        return alamat;
    }
    public void setTelp(String telp) {
        this.telp = telp;
    }
    public String getTelp() {
        return telp;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
}