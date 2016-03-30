package mainbuku;

public class DataBuku {
    private String nama;
    private String alamat;
    private int telp;
    private String email;
    
    public DataBuku (){
    }
    
    public DataBuku(String nama, String alamat, int telp,String email){
    this.nama = nama;
    this.alamat = alamat;
    this.telp = telp;
    this.email = email;
    }
    
    public String getNama(){
        return nama;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    public int getTelp(){
        return telp;
    }
    
    public String getEmail(){
        return email;
    }
    
}
