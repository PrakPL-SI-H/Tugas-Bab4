package PrakPemLan;

public class BukuAlamat {

    public static String[] isidata = new String[7];
    public static String[] nama = new String[7];
    public static String[] alamat = new String[7];
    public static String[] notelp = new String[7];
    public static String[] email = new String[7];
    private int x;
    private static int data;

    public BukuAlamat() {
        data++;
    }

    public BukuAlamat(int a, String nama, String alamat, String no, String email) {
        this.nama[a] = nama;
        this.alamat[a] = alamat;
        this.notelp[a] = no;
        this.email[a] = email;
        data++;
    }

    public static int getData() {
        return data;
    }

    public void setNama() {
        this.nama = nama;
    }

    public void setAlamat() {
        this.alamat = alamat;
    }

    public void setNo() {
        this.notelp = notelp;
    }

    public void setEmail() {
        this.email = email;
    }

    public String getNama(int x) {
        return nama[x];
    }

    public String getAlamat(int x) {
        return alamat[x];
    }

    public String getNo(int x) {
        return notelp[x];
    }

    public String getEmail(int x) {
        return email[x];
    }

    public void display() {
        System.out.println("########################################");
        System.out.println("Nama lengkap\t\t: " + getNama(x));
        System.out.println("Alamat lengkap\t\t: " + getAlamat(x));
        System.out.println("Nomor telepon personal\t: " + getNo(x));
        System.out.println("Alamat e-mail personal\t: " + getEmail(x));
        System.out.println("########################################");
    }
}