package prakproglan;
public class MainBukuAlamat {
    public static void main(String[] args) {
        BukuAlamat satu = new BukuAlamat();
        BukuAlamat dua = new BukuAlamat();
        BukuAlamat tiga = new BukuAlamat();
        BukuAlamat empat = new BukuAlamat();
        BukuAlamat lima = new BukuAlamat();
        
        satu.setNama("Aldo");
        satu.setAlamat("Jl. Borobudur No.19");
        satu.setNotelp("089654884963");
        satu.setEmail("aldogg@gmail.com");
        satu.showInfo();
        
        dua.setNama("Rendi");
        dua.setAlamat("Griya Bhayangkari B-15");
        dua.setNotelp("088976453555");
        dua.setEmail("rekren4@gmail.com");
        dua.showInfo();
        
        tiga.setNama("Mira");
        tiga.setAlamat("Jl. Candi Mendut No.2");
        tiga.setNotelp("081860451660");
        tiga.setEmail("mirrmira@yahoo.co.id");
        tiga.showInfo();
        
        empat.setNama("Elsa");
        empat.setAlamat("Jl. Gedangan No.9");
        empat.setNotelp("081755087337");
        empat.setEmail("elsasle@gmail.com");
        empat.showInfo();
        
        lima.setNama("Fiko");
        lima.setAlamat("Griya Santha A-22");
        lima.setNotelp("085651744321");
        lima.setEmail("fikof1@yahoo.co.id");
        lima.showInfo();
    }
}
