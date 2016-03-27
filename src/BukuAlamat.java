package PrakPemLan;

public class BukuAlamat {

    String data[] = new String[5];
    private String nama, almt, nmrtelp, email;

    public BukuAlamat(String n) {
        this.nama = n;
    }

    public String getNama() {
        return this.nama;
    }

    public void setAddress(String a) {
        almt = a;
    }

    public String getAddress() {
        return almt;
    }

    public void setPhoneNumber(String hp) {
        nmrtelp = hp;
    }

    public String getPhoneNumber() {
        return nmrtelp;
    }

    public void setEmailAddress(String e) {
        email = e;
    }

    public String getEmailAddress() {
        return email;
    }

    public void PrintData() {
        for (int i = 0; i < data.length; i++) {
            System.out.println("Nama lengkap\t\t: " + this.nama);
            System.out.println("Alamat lengkap\t\t: " + almt);
            System.out.println("Nomor telepon personal\t: " + nmrtelp);
            System.out.println("Alamat e-mail personal\t: " + email);
            System.out.println();
        }
    }
}