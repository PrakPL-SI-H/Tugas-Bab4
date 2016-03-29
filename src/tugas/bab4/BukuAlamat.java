package tugas.bab4;

public class BukuAlamat {

    private String data[]; //indeks 0 = nama, 1 = alamat, 2 = no telfon, 3 = Email

    public BukuAlamat() {
        data = new String[4];
    }

    public void setNama(String nama) {
        data[0] = nama;
    }

    public void setAlamat(String alamat) {
        data[1] = alamat;
    }

    public void setNoTel(String tel) {
        data[2] = tel;
    }

    public void setEmail(String email) {
        data[3] = email;
    }

    public String getNama() {
        return data[0];
    }

    public String getAlamat() {
        return data[1];
    }

    public String getNoTel() {
        return data[2];
    }

    public String getEmail() {
        return data[3];
    }

    public void showData() {
        System.out.println("Nama          =  " + data[0]);
        System.out.println("Alamat        =  " + data[1]);
        System.out.println("Nomor Telepon =  " + data[2]);
        System.out.println("Alamat E-mail =  " + data[3]);
    }
}
