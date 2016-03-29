
package mainencapsulasi;

public class Encapsulasi {
    private String nama[], alamat[], telp[], email[];
    public static int i = 0;
    
    public Encapsulasi(String a, String b, String c, String d){
        setBuku(a, b, c, d);
        i++;
    }
    
    public void setBuku(String a, String b, String c, String d){
        nama[i] = a;
        alamat[i] = b;
        telp[i] = c;
        email[i] = d;
    }
    
}
