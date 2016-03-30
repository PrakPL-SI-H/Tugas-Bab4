package alamat;
public class Alamat {
    private String Nama, Alamat, NomorTelp, Email;
    public Alamat(String nama, String alamat, String notelp, String email) {
        this.Nama = nama;
        this.Alamat = alamat;
        this.NomorTelp = notelp;
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
        this.NomorTelp = notelp;
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
    public String getNomorTelp() {
        return this.NomorTelp;
    }
    public String getEmail() {
        return this.Email;
    }
    public void displayMessage() {
        System.out.printf("%-25s\t%s\n", "     Atribut", "Deskripsi");
        System.out.println(" ===========================================================");
        System.out.printf(" ||%20s\t%s\n","  Nama              |",getNama());
        System.out.println("------------------------------------------------------------");
        System.out.printf(" ||%20s\t%s\n","  Alamat            |",getAlamat());
        System.out.println("------------------------------------------------------------");
        System.out.printf(" ||%20s\t%s\n","  Nomor Telepon     |",getNomorTelp());
        System.out.println("------------------------------------------------------------");
        System.out.printf(" ||%20s\t%s\n","  Alamat E-Mail     |",getEmail());
        System.out.println(" ===========================================================");
    }
}