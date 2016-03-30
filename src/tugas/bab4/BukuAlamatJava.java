package bukualamat.java;

public class BukuAlamatJava {

    public static void main(String[] args) {
        BukuAlamat a1 = new BukuAlamat();
        a1.SetAll("Hemy Dwi Pratiwi", "Jalanin Aja Dulu", "081391448444", "hemydwipratiwi05@gmail.com");
        BukuAlamat a2 = new BukuAlamat("Ashilah Qurratu Aini", "Jalanin Bersama Mu", "0813356785", "BinggungNulisApa05@gmail.com");
        System.out.println("Nama        :" + a1.GetName());
        System.out.println("Alamat      :" + a1.GetAddress());
        System.out.println("No.Telpon   :" + a1.GetPhone());
        System.out.println("E-mail      :" + a1.GetMail());
        System.out.println("");
        a2.ShowData();

    }

}
