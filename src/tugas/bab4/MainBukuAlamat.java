package prakproglan;
public class MainBukuAlamat {
    public static void main(String[] args) {
        BukuAlamat satu = new BukuAlamat("Aldo");
        BukuAlamat dua = new BukuAlamat("Rendi");
        BukuAlamat tiga = new BukuAlamat("Mira");
        BukuAlamat empat = new BukuAlamat("Elsa");
        BukuAlamat lima = new BukuAlamat("Fiko");
        
        satu.setAlamat("Jl. Borobudur No.19");
        satu.setNotelp("089654884963");
        satu.setEmail("aldogg@gmail.com");
        satu.showInfo();
        
        dua.setAlamat("Griya Bhayangkari B-15");
        dua.setNotelp("088976453555");
        dua.setEmail("rekren4@gmail.com");
        dua.showInfo();
        
        tiga.setAlamat("Jl. Candi Mendut No.2");
        tiga.setNotelp("081860451660");
        tiga.setEmail("mirrmira@yahoo.co.id");
        tiga.showInfo();
        
        empat.setAlamat("Jl. Gedangan No.9");
        empat.setNotelp("081755087337");
        empat.setEmail("elsasle@gmail.com");
        empat.showInfo();
        
        lima.setAlamat("Griya Santha A-22");
        lima.setNotelp("085651744321");
        lima.setEmail("fikof1@yahoo.co.id");
        lima.showInfo();
    }
}
