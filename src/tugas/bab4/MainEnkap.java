
public class MainEnkap {

    public static void main(String[] args) {
        String[] nama = new String[5];
        String[] alamat = new String[5];
        String[] notlp = new String[5];
        String[] email = new String[5];


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
