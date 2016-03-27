package PraktikumSIH;
public class BukuAlamat {
    private String nama;
    private String alamat;
    private String noTelp;
    private String alamatEmail;
    public BukuAlamat() {
        nama = " ";
        alamat = " ";
        noTelp = " ";
        alamatEmail = " ";
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public String getNoTelp() {
        return noTelp;
    }
    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }
    public String getAlamatEmail() {
        return alamatEmail;
    }
    public void setAlamatEmail(String alamatEmail) {
        this.alamatEmail = alamatEmail;
    }
    public void displaybukuAlamat(String nama,String alamat,String noTelp,String alamatEmail) {
        System.out.println("--------------------------------------------------------------------");
        System.out.println("                      Data - Data Buku Alamat                      ");
        System.out.printf("%-15s%-15s%-20s%s\n", "NAMA", "ALAMAT", "NOMOR TELEPON", "ALAMAT EMAIL");
        System.out.printf("%-15s%-15s%-20s%s\n", nama, alamat, noTelp, alamatEmail);
        System.out.println("--------------------------------------------------------------------");
        System.out.println();
    }
}
