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
    public void displayMessage(int x){
           if (x == 0) {
            System.out.println("==================================================================================================================================");
            System.out.println("\t\t\t\t\t\t\tBUKU ALAMAT");
            System.out.println("==================================================================================================================================");
            System.out.printf("|%-5s |%-25s |%-40s |%-20s |%-30s | \n", "No", "Nama", "Alamat","Nomor Telepon","Alamat E-mail");
            System.out.println("==================================================================================================================================");
        }
     System.out.printf("|%-5s |%-25s |%-40s |%-20s |%-30s | \n", x+1, nama, alamat, notelepon,email );
     System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
    }
            
}
