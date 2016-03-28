public class Data {
    private String nama, alamat, email, notelepon;
    Data(){
    
    }
    Data (String name, String address, String mail, String no){
        this.nama = name;
        this.alamat = address;
        this.notelepon = no;
        this.email = mail;
    }
    
    public void setNama (String name){
        this.nama = name;
    }
    public String getNama (){
        return nama;
    }
    public void setAlamat (String address){
        this.alamat = address;
    }
    public String getAlamat (){
        return alamat;
    }
    public void setEmail (String mail){
        this.email = mail;
    }
    public String getEmail (){
        return email;
    }
    public void setNotelepon (String no){
        this.notelepon = no;
    }
    public void displayMessage(){
         System.out.printf("|%-25s |%-40s |%-20s |%-30s | \n", "Nama", "Alamat","Nomor Telepon","Alamat E-mail");
     System.out.printf("|%-25s |%-40s |%-20s |%-30s | \n", nama, alamat, notelepon,email );
    }
            
}
