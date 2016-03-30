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

    public void displayMessage() {
        System.out.println("------------------------------------------------------");
        System.out.printf("%-25s\t%s\n", "Atribut", "Deskripsi");
        System.out.println("------------------------------------------------------");
        System.out.printf("%-20s\t%s\n", "Nama", getNama());
        System.out.printf("%-20s\t%s\n", "Alamat", getAlamat());
        System.out.printf("%-20s\t%s\n", "NomorTelepon", getNoTelp());
        System.out.printf("%-20s\t%s\n", "Alamat E-Mail", getEmail());
    }
}
