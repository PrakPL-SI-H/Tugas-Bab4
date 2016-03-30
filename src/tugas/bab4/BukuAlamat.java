package bukualamat;

public class BukuAlamat {
    private String nama,alamat,telp,email;
    public BukuAlamat(String nama, String alamat, String telp, String email) {
        this.nama = nama;
        this.alamat = alamat;
        this.telp = telp;
        this.email = email;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setTelp(String telp) {
        this.telp = telp;
    }
    public String getNama() {
        return nama;
    }
    public String getAlamat() {
        return alamat;
    }
    public String getTelp() {
        return telp;
    }
    public String getEmail() {
        return email;
    }
        

