package tugas.bab4;

public class BukuAlamat {

    private String data[][]; //indeks 0 = nama, 1 = alamat, 2 = no telfon, 3 = Email

    public BukuAlamat(int i) {
        data = new String[i][4];
    }

    public void setNama(String nama, int i) {
        data[i][0] = nama;
    }

    public void setAlamat(String alamat, int i) {
        data[i][1] = alamat;
    }

    public void setNoTel(String tel, int i) {
        data[i][2] = tel;
    }

    public void setEmail(String email, int i) {
        data[i][3] = email;
    }

    public String getNama(int i) {
        return data[i][0];
    }

    public String getAlamat(int i) {
        return data[i][1];
    }

    public String getNoTel(int i) {
        return data[i][2];
    }

    public String getEmail(int i) {
        return data[i][3];
    }
}
