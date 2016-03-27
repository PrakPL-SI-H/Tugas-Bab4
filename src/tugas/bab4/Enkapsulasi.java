package Praktikum4;

// @author Arif Ramadhan
public class Enkapsulasi {

    public String name, address, numtlp, email;
    private String nama, alamat, notlp, e_mail;

    public Enkapsulasi(String name, String address, String numtlp, String email) {
        this.name = name;
        this.address = address;
        this.numtlp = numtlp;
        this.email = email;
    }

    public void setNama(String nam) {
        nama=nam;
    }

    public void setAlamat(String alama) {
        alamat=alama;
    }

    public void setNotlp(String no) {
        notlp=no;
    }

    public void setEmail(String mail) {
        e_mail=mail;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNotlp() {
        return notlp;
    }

    public String getEmail() {
        return e_mail;
    }
    
}
