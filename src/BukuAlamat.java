package bab4;
public class BukuAlamat{
    private String Nama;
    private String Alamat;
    private String NoTel;
    private String email;

    public BukuAlamat(){
        this.Nama = "";
        this.Alamat = "";
        this.NoTel = "";
        this.email = "";
    }
    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }
    public String getAlamat() {
        return Alamat;
    }
    public void setNama(String Nama) {
        this.Nama = Nama;
    }
    public String getNama() {
        return Nama;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    public void setNoTel(String NoTel) {
        this.NoTel = NoTel;
    }
    public String getNoTel() {
        return NoTel;
    }
}