public class BukuAlamat {

    private String nama;
    private String alamat;
    private String noHp;
    private String email;

    public BukuAlamat() {
    }

    public BukuAlamat(String nama, String alamat, String noHp, String email) {
        this.nama = nama;
        this.alamat = alamat;
        this.noHp = noHp;
        this.email = email;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
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

    public String getNoHp() {
        return noHp;
    }

    public String getEmail() {
        return email;
    }
}
