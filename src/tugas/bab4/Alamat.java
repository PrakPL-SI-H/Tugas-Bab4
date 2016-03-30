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
    public static void main(String[] args) {
        Alamat identitas1 = new Alamat("Lili Kordina", "Puri Cempaka Putih II", "081234567890", "lilikordina@gmail.com");
        identitas1.displayMessage();
        System.out.println();
        Alamat identitas2 = new Alamat();
        identitas2.setNama("Annastasya Shabrina");
        identitas2.setAlamat("Sekip Ujung Palembang");
        identitas2.setNoTelp("081234567890");
        identitas2.setEmail("nastishabrina@gmail.com");
        identitas2.displayMessage();
        System.out.println();
        Alamat identitas3 = new Alamat();
        identitas3.setNama("Kayla Latifah Yanuarti");
        identitas3.setAlamat("Sekip Ujung Palembang");
        identitas3.setNoTelp("081234567890");
        identitas3.setEmail("kaylayanuarti@gmail.com");
        identitas3.displayMessage();
        System.out.println();
        Alamat identitas4 = new Alamat("M. Ikhsan Al-Hafiz", "Talang Pangeran Ulu", "081234567890", "ican_alhafiz@gmail.com");
        identitas4.displayMessage();
        System.out.println();
        Alamat identitas5 = new Alamat("Alfiyah Zahra Ramadhani", "Komp. Sintraman Jaya", "081234567890", "azahraramadhani@gmail.com");
        identitas3.displayMessage();
    }
}
