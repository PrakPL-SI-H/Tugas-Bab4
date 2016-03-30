
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
public static void main(String[] args) {
        System.out.println("====================================================");
        System.out.printf("%-25s%s\n", "Atribut", "Deskripsi");
        System.out.println("====================================================");
        bukuAlamat user1 = new bukuAlamat();
        user1.setNama("Dyah Arifiani");
        user1.setAlamat("Jl. Kerto Pamuji No.72");
        user1.setNoTelp("085360704332");
        user1.setEmail("arifianidyah@gmail.com");
        user1.tampilkan();
        bukuAlamat user2 = new bukuAlamat();
        user2.setNama("Nanda Fiesta Farada");
        user2.setAlamat("Jl. Simpang Sunan Kali Jaga A8");
        user2.setNoTelp("085608074350");
        user2.setEmail("nandafiestafarada@gmail.com");
        user2.tampilkan();
        bukuAlamat user3 = new bukuAlamat();
        user3.setNama("Weni Gusti Rahayu");
        user3.setAlamat("Jl. Terusan Cikampek Kav 1A");
        user3.setNoTelp("085283929483");
        user3.setEmail("wenigr97@gmail.com");
        user3.tampilkan();
        bukuAlamat user4 = new bukuAlamat();
        user4.setNama("Lili Kordina Harahap");
        user4.setAlamat("Jl. Mawar No.4 Bumi Ayu");
        user4.setNoTelp("085283258011");
        user4.setEmail("lilikordina@gmail.com");
        user4.tampilkan();
        bukuAlamat user5 = new bukuAlamat();
        user5.setNama("Fitri Resdiyani");
        user5.setAlamat("Jl. Sigura-gura No.38");
        user5.setNoTelp("085612342314");
        user5.setEmail("fitriresdiyani@gmail.com");
        user5.tampilkan();

    }
}