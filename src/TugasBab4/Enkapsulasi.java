package TugasBab4;

public class Enkapsulasi {

    private String nama, alamat, nomor, mail;

    public Enkapsulasi(String nama, String alamat, String nomor, String mail) {
        this.nama = nama;
        this.alamat = alamat;
        this.nomor = nomor;
        this.mail = mail;
    }
    
    public String getNama(){
        return nama;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    public String getNomor(){
        return nomor;
    }
    
    public String getMail(){
        return mail;
    }
}
