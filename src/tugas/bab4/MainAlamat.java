package mainalamat;
public class MainAlamat {
    public static void main(String[] args) {
        System.out.println("\t\t DATA BUKU ALAMAT");
        System.out.println("");
        Alamat a1 = new Alamat("Weni Gusti Rahayu", "Jalan Terusan Cikampek Kav 1A", "081378360334", "wenigr97@gmail.com");
        a1.displayMessage();
        System.out.println();
        Alamat a2 = new Alamat();
        a2.setNama("Katherine IvanaRuslim");
        a2.setAlamat("Jalan SumberSari Gg 1 No 2");
        a2.setNoTelp("081266406565");
        a2.setEmail("katherineruslim@yahoo.co.id");
        a2.displayMessage();
        System.out.println();
        Alamat a3 = new Alamat("Afni Hasanah", "Jalan MT Haryono No 35", "082284574507", "afnihasanah@gmail.com");
        a3.displayMessage();      
        Alamat a4 = new Alamat("Dona Adestia","Jalan Papa Putih No 10","082276580932","donaadestia@gmail.com");
        a4.displayMessage();       
        Alamat a5 = new Alamat();
        a5.setNama("Aulya Ramadhani");
        a5.setAlamat("Jalan Terusan Cikampek Kav 4A");
        a5.setNoTelp("089645783475");
        a5.setEmail("caul@yahoo.co.id");
        a5.displayMessage();
    }
}
