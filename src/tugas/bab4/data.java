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
    public void setAlamat(String temp){ //MUTATOR
        alamat = temp;
    }
}