
public class MainEnkap {

    public static void main(String[] args) {
        String[] nama = new String[5];
        String[] alamat = new String[5];
        String[] notlp = new String[5];
        String[] email = new String[5];

        EnkapsulasiClass o1 = new EnkapsulasiClass("Muhammad Iqbal", "Jalan Bungur Raya Blok B3-B4 Harjamukti,Depok", "0838064444675", "iqbal0804@gmail.com");
        o1.setNama();
        o1.setAlamat();
        o1.setNotlp();
        o1.setEmail();
        nama[0] = o1.getNama();
        alamat[0] = o1.getAlamat();
        notlp[0] = o1.getNotlp();
        email[0] = o1.getEmail();

        EnkapsulasiClass o2 = new EnkapsulasiClass("Maudy Ariani", "Jalan Bungur II Blok C2 Harjamukti,Depok", "083804333412", "maudyariani@yahoo.co.id");
        o2.setNama();
        o2.setAlamat();
        o2.setNotlp();
        o2.setEmail();
        nama[1] = o2.getNama();
        alamat[1] = o2.getAlamat();
        notlp[1] = o2.getNotlp();
        email[1] = o2.getEmail();

        EnkapsulasiClass o3 = new EnkapsulasiClass("Agie Vadilla Putri", "Jalan Cerri Raya No.2 Sukatani,Tapos", "081232114321", "agiepelangi@gmail.com");
        o3.setNama();
        o3.setAlamat();
        o3.setNotlp();
        o3.setEmail();
        nama[2] = o3.getNama();
        alamat[2] = o3.getAlamat();
        notlp[2] = o3.getNotlp();
        email[2] = o3.getEmail();

        EnkapsulasiClass o4 = new EnkapsulasiClass("Muhammad Rizki Fauzi", "Jalan Apel Raya No.21 Cimanggis,Depok ", "085744543321", "mrzfauzi@gmail.com");
        o4.setNama();
        o4.setAlamat();
        o4.setNotlp();
        o4.setEmail();
        nama[3] = o4.getNama();
        alamat[3] = o4.getAlamat();
        notlp[3] = o4.getNotlp();
        email[3] = o4.getEmail();

        EnkapsulasiClass o5 = new EnkapsulasiClass("AmbangMan", "Jalan Candi Panggung No.32 Malang,Jawa Timur", "081234567890", "ambangman@gmail.com");
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
