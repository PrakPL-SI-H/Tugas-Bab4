
public class EnkapsulasiClass {

    public String name, address, phone, email;
    private String nama, alamat, notlp, mail;

    public EnkapsulasiClass(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public void setNama() {
        nama = name;
    }

    public String getNama() {
        return nama;
    }

    public void setAlamat() {
        alamat = address;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setNotlp() {
        notlp = phone;
    }

    public String getNotlp() {
        return notlp;
    }

    public void setEmail() {
        mail = email;
    }

    public String getEmail() {
        return mail;
    }

}
