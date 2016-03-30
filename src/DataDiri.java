package javaapplication10;

public class DataDiri {

    private String NamaLengkap;
    private String Alamat;
    private String NoTelepon;
    private String email;

    public DataDiri() {
        
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setNamaLengkap(String NamaLengkap) {
        this.NamaLengkap = NamaLengkap;
    }

    public String getNamaLengkap() {
        return NamaLengkap;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setNoTelepon(String NoTelepon) {
        this.NoTelepon = NoTelepon;
    }

    public String getNoTelepon() {
        return NoTelepon;
    }

    /**public void DisplayMessage() {
        System.out.println("Nama Lengkap : " + NamaLengkap);
        System.out.println("Alamat : " + Alamat);
        System.out.println("Nomor Telepon : " + NoTelepon);
        System.out.println("Email : " + email);
    }*/

    
}
