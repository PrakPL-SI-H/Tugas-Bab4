public class data{
private static String nama;
private String alamat;
private String notlp;
private String email;
    public data (String temp){ //CONSTRUCTOR
        nama = temp;
    }
    public String getAlamat(){  //ACCESSOR
        return alamat;
    }
    
    public void tampilkan(){
        System.out.println("++++++++ Buku Telpon ++++++++");
        System.out.println("Nama : "+nama); //dari constructor
        System.out.println("Alamat : "+getAlamat());
        System.out.println("Nomor telp : ");
        System.out.println("Email : ");
    }
}