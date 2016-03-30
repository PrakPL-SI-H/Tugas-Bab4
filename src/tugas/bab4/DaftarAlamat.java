
package tugas.bab4;

public class DaftarAlamat {
   private String[] nama = new String[100];
   private String[] alamat = new String[100];
   private String[] nomor = new String[100];
   private String[] email = new String[100];   
   private int jumlah;
   
    DaftarAlamat(){
       jumlah = 0;
    }
    
    void isiAlamat (String n, String a , String no , String em){
      
     this.nama[jumlah]=n;
     this.alamat[jumlah]=a;
     this.nomor[jumlah]=no;
     this.email[jumlah]=em;
     jumlah++;
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
    
 public void getDaftar(){
    for (int i = 0 ; i < jumlah ; i++){
        System.out.println(i+".Nama :"+nama[i]);
    }
 }    
}

