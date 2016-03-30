package bukualamat;

public class BukuAlamat {
    private String nama,alamat,telp,email;
    public BukuAlamat(String nama, String alamat, String telp, String email) {
        this.nama = nama;
        this.alamat = alamat;
        this.telp = telp;
        this.email = email;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setTelp(String telp) {
        this.telp = telp;
    }
    public String getNama() {
        return nama;
    }
    public String getAlamat() {
        return alamat;
    }
    public String getTelp() {
        return telp;
    }
    public String getEmail() {
        return email;
    }
        public static void main(String[] args) {
        BukuAlamat ini = new BukuAlamat("Muhammad Arif Fathony", "Malang", "08135787386", "onythree1@yahoo.co.id");
        System.out.println("Tampil Informasi : ");
        System.out.println("Nama   : "+ini.getNama());
        System.out.println("Alamat : "+ini.getAlamat());
        System.out.println("Telp   : "+ini.getTelp());
        System.out.println("Email  : "+ini.getEmail());
        System.out.println("Memasukkan inputan : ");
            ini.setNama("Paijo");
            System.out.println("Nama    : "+ini.getNama());
            ini.setAlamat("Surabaya");
            System.out.println("Alamat  : "+ini.getAlamat());
            ini.setTelp ("08123456789");
            System.out.println("Telp    : "+ini.getTelp());
            ini.setEmail("Paijo@yahoo.com");
            System.out.println("Email   : "+ini.getEmail());
    }
}

