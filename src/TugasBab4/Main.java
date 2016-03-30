package TugasBab4;

public class Main {

    public static void main(String[] args) {
        String nama[] = new String[3];
        String alamat[] = new String[3];
        String nomor[] = new String[3];
        String mail[] = new String[3];
        String line = "======================================";

        Enkapsulasi p1 = new Enkapsulasi("Bambang", "Betawi", "021222333", "bambang@bajai.com");
        nama[0] = p1.getNama();
        alamat[0] = p1.getAlamat();
        nomor[0] = p1.getNomor();
        mail[0] = p1.getMail();

        Enkapsulasi p2 = new Enkapsulasi("Bajuri", "Betawi", "021333444", "bajuri@bajai.com");
        nama[1] = p2.getNama();
        alamat[1] = p2.getAlamat();
        nomor[1] = p2.getNomor();
        mail[1] = p2.getMail();

        Enkapsulasi p3 = new Enkapsulasi("Oneng", "Betawi", "021444555", "oneng@bajai.com");
        nama[2] = p3.getNama();
        alamat[2] = p3.getAlamat();
        nomor[2] = p3.getNomor();
        mail[2] = p3.getMail();

        System.out.println(line);
        System.out.println("            DAFTAR KONTAK");
        System.out.println(line);
        for (int i = 0; i < nama.length; i++) {
            System.out.print("NAMA      : ");
            System.out.println(nama[i]);
            System.out.print("ALAMAT    : ");
            System.out.println(alamat[i]);
            System.out.print("NO.TELP   : ");
            System.out.println(nomor[i]);
            System.out.print("E-MAIL    : ");
            System.out.println(mail[i]);
            System.out.println("");
        }
        System.out.println(line);
    }
}
