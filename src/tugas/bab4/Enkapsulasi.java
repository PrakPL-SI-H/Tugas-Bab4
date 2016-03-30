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

    public void setNama() {
        nama=name;
    }

    public void setAlamat() {
        alamat=address;
    }

    public void setNotlp() {
        notlp=numtlp;
    }

    public void setEmail() {
        e_mail=email;
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
