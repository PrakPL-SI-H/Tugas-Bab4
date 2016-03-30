package mainalamat;

public class Alamat {

    private String Nama, Alamat, NoTelp, Email;

    public Alamat(String nama, String alamat, String notelp, String email) {
        this.Nama = nama;
        this.Alamat = alamat;
        this.NoTelp = notelp;
        this.Email = email;
    }

    public Alamat() {
    }

    public void setNama(String nama) {
        this.Nama = nama;
    }

    public void setAlamat(String alamat) {
        this.Alamat = alamat;
    }

    public void setNoTelp(String notelp) {
        this.NoTelp = notelp;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public String getNama() {
        return this.Nama;
    }

    public String getAlamat() {
        return this.Alamat;
    }

    public String getNoTelp() {
        return this.NoTelp;
    }

    public String getEmail() {
        return this.Email;
    }

}
