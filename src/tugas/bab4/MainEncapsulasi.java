//Nama : Felix Yosa H. S.
//NIM : 155150400111129
//Kelas : SI-H
package mainencapsulasi;

public class MainEncapsulasi {

    public static void main(String[] args) {
        String nama[], alamat[], telp[], email[] = new String[5];

        Encapsulasi data1 = new Encapsulasi("Felix Yosa", "Jalan Ikan Tombro",
                "0812345", "felixyosa@yahoo.com");
        Encapsulasi data2 = new Encapsulasi("Herdima Sanjaya", "Jalan Ikan Hiu",
                "0898765", "herdimasanjaya@yahoo.com");
        Encapsulasi data3 = new Encapsulasi("Abraham Tito", "Jalan Ikan Nila",
                "0821567", "abrahamtito@yahoo.com");
        Encapsulasi data4 = new Encapsulasi();
        Encapsulasi data5 = new Encapsulasi();

        data4.setNama("Agis Della");
        data4.setAlamat("Jalan Ikan Paus");
        data4.setTelp("0857891");
        data4.setEmail("agisdella@yahoo.com");

        data5.setNama("Afesa Austin");
        data5.setAlamat("Jalan Ikan Gurami");
        data5.setTelp("0810341");
        data5.setEmail("afesaaustin@yahoo.com");

        System.out.println("====BUKU ALAMAT FELIX====");
        System.out.println("");
        System.out.println("Nama\t\t: " + data1.getNama());
        System.out.println("Alamat\t\t: " + data1.getAlamat());
        System.out.println("Nomor Telepon\t: " + data1.getTelp());
        System.out.println("Alamat E-mail\t: " + data1.getEmail());
        System.out.println("");
        System.out.println("Nama\t\t: " + data2.getNama());
        System.out.println("Alamat\t\t: " + data2.getAlamat());
        System.out.println("Nomor Telepon\t: " + data2.getTelp());
        System.out.println("Alamat E-mail\t: " + data2.getEmail());
        System.out.println("");
        System.out.println("Nama\t\t: " + data3.getNama());
        System.out.println("Alamat\t\t: " + data3.getAlamat());
        System.out.println("Nomor Telepon\t: " + data3.getTelp());
        System.out.println("Alamat E-mail\t: " + data3.getEmail());
        System.out.println("");
        System.out.println("Nama\t\t: " + data4.getNama());
        System.out.println("Alamat\t\t: " + data4.getAlamat());
        System.out.println("Nomor Telepon\t: " + data4.getTelp());
        System.out.println("Alamat E-mail\t: " + data4.getEmail());
        System.out.println("");
        System.out.println("Nama\t\t: " + data1.getNama());
        System.out.println("Alamat\t\t: " + data1.getAlamat());
        System.out.println("Nomor Telepon\t: " + data1.getTelp());
        System.out.println("Alamat E-mail\t: " + data1.getEmail());
        System.out.println("");
        System.out.println("Nama\t\t: " + data5.getNama());
        System.out.println("Alamat\t\t: " + data5.getAlamat());
        System.out.println("Nomor Telepon\t: " + data5.getTelp());
        System.out.println("Alamat E-mail\t: " + data5.getEmail());

    }

}
