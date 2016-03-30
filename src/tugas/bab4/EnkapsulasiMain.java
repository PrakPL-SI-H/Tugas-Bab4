package Praktikum4;

 // @author Arif Ramadhan
public class EnkapsulasiMain {

    public static void main(String[] args) {
        String[] nama = new String[5];
        String[] alamat = new String[5];
        String[] notlp = new String[5];
        String[] email = new String[5];

        Enkapsulasi o1 = new Enkapsulasi("Arif Ramadhan", "Jl.Kertoraharjo no.24 Malang", "085817602880", "ariframadhan902@yahoo.com");
        o1.setNama();
        o1.setAlamat();
        o1.setNotlp();
        o1.setEmail();
        nama[0] = o1.getNama();
        alamat[0] = o1.getAlamat();
        notlp[0] = o1.getNotlp();
        email[0] = o1.getEmail();

        Enkapsulasi o2 = new Enkapsulasi("Dikny Asti Khaerunnisa", "Jl.Baros no.1 Serang", "087718614780", "diknyasti@gmail.com");
        o2.setNama();
        o2.setAlamat();
        o2.setNotlp();
        o2.setEmail();
        nama[1] = o2.getNama();
        alamat[1] = o2.getAlamat();
        notlp[1] = o2.getNotlp();
        email[1] = o2.getEmail();

        Enkapsulasi o3 = new Enkapsulasi("Gizan Dharmawan", "Jl.Siliwangi no.4 Rangkasbitung", "08134503901", "gizandh@gmail.com");
        o3.setNama();
        o3.setAlamat();
        o3.setNotlp();
        o3.setEmail();
        nama[2] = o3.getNama();
        alamat[2] = o3.getAlamat();
        notlp[2] = o3.getNotlp();
        email[2] = o3.getEmail();

        Enkapsulasi o4 = new Enkapsulasi("Rian Permana", "Jl.Raya denpasar no.7 Denpasar", "089677078809", "riianp@yahoo.com");
        o4.setNama();
        o4.setAlamat();
        o4.setNotlp();
        o4.setEmail();
        nama[3] = o4.getNama();
        alamat[3] = o4.getAlamat();
        notlp[3] = o4.getNotlp();
        email[3] = o4.getEmail();

        Enkapsulasi o5 = new Enkapsulasi("Putri Anggraeni", "Jl.Kelapa dua no.11 Jakarta Utara", "089613452567", "putrianggraeni@gmail.com");
        o5.setNama();
        o5.setAlamat();
        o5.setNotlp();
        o5.setEmail();
        nama[4] = o5.getNama();
        alamat[4] = o5.getAlamat();
        notlp[4] = o5.getNotlp();
        email[4] = o5.getEmail();

        System.out.println("============ BUKU INFORMASI ============");
        System.out.println("----------------------------------------");
        for (int i = 0; i < 5; i++) {
            System.out.print("NAMA      : ");
            System.out.println(nama[i]);
            System.out.print("ALAMAT    : ");
            System.out.println(alamat[i]);
            System.out.print("NO TELP   : ");
            System.out.println(notlp[i]);
            System.out.print("EMAIL     : ");
            System.out.println(email[i]);
            System.out.println("");

        }
    }
}
