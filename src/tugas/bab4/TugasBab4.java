package mainbuku;

public class bukuAlamat {

    private String nama, alamat, noTelp, email;

    public bukuAlamat(String nama, String alamat, String noTelp, String email) {
        this.nama = nama;
        this.alamat = alamat;
        this.noTelp = noTelp;
        this.email = email;
    }

    public bukuAlamat() {

    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNama() {
        return this.nama;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public String getNoTelp() {
        return this.noTelp;
    }

    public String getEmail() {
        return this.email;
    }
    public void tampilkan(){
        System.out.println("====================================================");
        System.out.printf("%25s\t%s\n","Atribut","Deskripsi");
        System.out.println("====================================================");
        System.out.printf("%20s\t%s\n","Nama",getNama());
        System.out.printf("%20s\t%s\n","Alamat",getAlamat());
        System.out.printf("%20s\t%s\n","Nomor Telepon",getNoTelp());
        System.out.printf("%20s\t%s\n","Alamat E-Mail",getEmail());
        System.out.println("====================================================");
    }
}