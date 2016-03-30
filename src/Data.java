package addressbook;

public final class Data {

    private String name;
    private String address;
    private int noCall;
    private String emailAddress;
    public Data(){}//konstruktor kosong(default).

    public Data(String a, String b, int c, String d) { //Membuat Konstruktor 
        //konstruktor untuk class Data
        setName(a);
        setAddress(b);
        setNocall(c);
        setEmail(d);
    }

    public void setName(String a) { //Membuat Mutator setName
        this.name = a;
    }

    public void setAddress(String a) { //Membuat Mutator setAddress
        this.address = a;
    }

    public void setNocall(int a) { //Membuat Mutator setNocall
        this.noCall = a;
    }

    public void setEmail(String a) { //Membuat Mutator setEmail
        this.emailAddress = a;
    }

    public String getName() { //Membuat Accesor getName
        return name;
    }

    public String getAddress() { //Membuat Accesor getAddress
        return address;
    }

    public int getNocall() { //Membuat Accesor getNocall
        return noCall;
    }

    public String getEmail() { //Membuat Accesor getEmail
        return emailAddress;
    }
    public void showKonstruk(){
        //tampilan KHUSUS untuk kosntruktor
        System.out.println("      ===Data Default Konstruktor==="); 
        System.out.println("Nama     :"+name);
        System.out.println("Alamat   :"+address);
        System.out.println("No.Telp  :"+noCall);
        System.out.println("E-Mail   :"+emailAddress);
        System.out.println("      ==============================");
    }
}
