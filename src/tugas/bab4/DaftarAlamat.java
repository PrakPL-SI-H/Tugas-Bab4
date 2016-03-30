
package tugas.bab4;

public class DaftarAlamat {
   private String[] nama , alamat , nomor ,email;
    
    DaftarAlamat(){
        
    }
    
    void isiAlamat (String n, String a , String no , String em, int i ){
     this.nama[i]=n;
     this.alamat[i]=a;
     this.nomor[i]=no;
     this.email[i]=em;
    }
    
    public String[] getNama(){
        return nama;
    }
    public String[] getAlamat(){
        return alamat;
    }
    public String[] getNomor(){
        return nomor;
    }
    public String[] getEmail(){
        return email;
    }
    
}
