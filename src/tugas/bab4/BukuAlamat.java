package prakproglan;
public class BukuAlamat {
    private String nama;
    private String alamat;
    private String notelp;
    private String email;
    
        public void setNama (String n){
        nama = n;
        }
        
        public String getNama(){
            return nama;
        }
        
        public void setAlamat(String al){
            alamat = al;
        }
        
        public String getAlamat(){
            return alamat;
        }
        
        public void setNotelp(String no){
            notelp = no;
        }
        
        public String getNotelp(){
            return notelp;
        }
        
        public void setEmail(String e){
            email = e;
        }
            
        public String getEmail(){
            return email;
        }
        
        public void showInfo(){
            System.out.println("Nama\t\t : "+nama);
            System.out.println("Alamat\t\t : "+getAlamat());
            System.out.println("Nomor Telepon\t : "+getNotelp());
            System.out.println("Alamat E-mail\t : "+getEmail());
            System.out.println("");
        }        
}
