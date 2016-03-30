package bukualamat.java;

class BukuAlamat {

    private String name, address, phone, email;

    public BukuAlamat() {
        name = "Hemy Dwi Pratiwi";
        address = "Jalanin Aja Dulu Ea~";
        phone = "081391448444";
        email = "hemydwipratiwi05@gmail.com";
    }

    public BukuAlamat(String nama, String alamat, String no, String surel) {
        name = nama;
        address = alamat;
        phone = no;
        email = surel;
    }

    public void SetAll(String nama, String alamat, String no, String surel) {
        name = nama;
        address = alamat;
        phone = no;
        email = surel;
    }

    public String GetName() {
        return name;
    }

    public String GetAddress() {
        return address;
    }

    public String GetPhone() {
        return phone;
    }

    public String GetMail() {
        return email;
    }

    public void ShowData() {
        System.out.println("Nama        :" + name);
        System.out.println("Alamat      :" + address);
        System.out.println("No. Telpon  :" + phone);
        System.out.println("E-mail      :" + email);
    }
}
