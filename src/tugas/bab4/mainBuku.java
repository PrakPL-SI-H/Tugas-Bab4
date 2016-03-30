public class mainBuku {

    public static void main(String[] args) {

        System.out.println("===== Accesor dan Mutator 1 ===== : ");
        BukuAlamat data1 = new BukuAlamat("Mr.george", "new york", "0899111222", "georgemanurung10@gmail.com");

        data1.setNama("Anderson Manurung");
        data1.setAlamat("jln.kertowaluyo no.9 malang");
        data1.setNoHp("08216853xxxx");
        data1.setEmail("Andersonmanurung10@gmail.com");
        
        System.out.println("Nama\t: " + data1.getNama());
        System.out.println("Alamat\t: " + data1.getAlamat());
        System.out.println("No Hp\t: " + data1.getNoHp());
        System.out.println("Email\t: " + data1.getEmail());
       
        System.out.println("\n===== Data Dengan Konstruktor 1 ===== : ");
        BukuAlamat data2 = new BukuAlamat("Mr.george", "new york", "0899111222", "georgemanurung10@gmail.com");

        System.out.println("Nama\t: " + data2.getNama());
        System.out.println("Alamat\t: " + data2.getAlamat());
        System.out.println("No Hp\t: " + data2.getNoHp());
        System.out.println("Email\t: " + data2.getEmail());
    
        System.out.println("===== Accesor dan Mutator 2 ===== : ");
        BukuAlamat data3 = new BukuAlamat("Mr.josh", "new york city", "0899111222", "joshmanurung22@gmail.com");

        data3.setNama("Mr.Anders");
        data3.setAlamat("jln.sumbersari malang");
        data3.setNoHp("08216853xxxx");
        data3.setEmail("Anders10@gmail.com");
        
        System.out.println("Nama\t: " + data3.getNama());
        System.out.println("Alamat\t: " + data3.getAlamat());
        System.out.println("No Hp\t: " + data3.getNoHp());
        System.out.println("Email\t: " + data3.getEmail());
       
        System.out.println("\n===== Data Dengan Konstruktor 2 ===== : ");
        BukuAlamat data4 = new BukuAlamat("Mr.josh", "new york city", "0899111xxx", "joshmanurung22@gmail.com");

        System.out.println("Nama\t: " + data4.getNama());
        System.out.println("Alamat\t: " + data4.getAlamat());
        System.out.println("No Hp\t: " + data4.getNoHp());
        System.out.println("Email\t: " + data4.getEmail());

    }
   

}
