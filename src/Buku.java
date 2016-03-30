package Bab4;
public class Buku {
    private String nama;
    private String alamat;
    private String notelepon;
    private String email;
    public Buku() {
    }
    public Buku(String n, String a, String t, String e) {
        nama = n;
        alamat = a;
        notelepon = t;
        email = e;
    }
    public void setNama(String n){ 
       nama=n; 
    } 
    public String getNama(){ 
       return nama; 
    }     
    public void setAlamat(String a){ 
       alamat = a; 
    }     
    public String getAlamat(){ 
       return alamat; 
    }
    public void setNomorTelepon(String t){ 
       notelepon = t; 
    }     
    public String getNomorTelepon(){ 
       return notelepon; 
    }
    public void setAlamtEmail(String e){ 
       email = e; 
    }     
    public String getAlamatEmail(){ 
       return email; 
    }
    public void showData(){
        System.out.println("Nama Lengkap\t: " + nama);
        System.out.println("Alamat Lengkap\t: " + alamat);
        System.out.println("Nomor Telepon\t: " + notelepon);
        System.out.println("Alamat Email\t: " + email);
    }
}
