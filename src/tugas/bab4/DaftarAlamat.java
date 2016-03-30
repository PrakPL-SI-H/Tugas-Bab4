
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
    
    public String getNama(int i){
        return nama[i];
    }
    public String getAlamat(int i){
        return alamat[i];
    }
    public String getNomor(int i){
        return nomor[i];
    }
    public String getEmail(int i){
        return email[i];
    }
    
}
