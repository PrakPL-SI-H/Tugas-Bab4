package mainbuku;

public class DataBuku {

    private static String nama;
    private static String alamat;
    private static int telp;
    private static String email;

    public DataBuku() {
    }

    public DataBuku(String nama, String alamat, int telp, String email) {
        this.nama = nama;
        this.alamat = alamat;
        this.telp = telp;
        this.email = email;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setTelp(int telp) {
        this.telp = telp;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public int getTelp() {
        return telp;
    }

    public String getEmail() {
        return email;
    }

}
