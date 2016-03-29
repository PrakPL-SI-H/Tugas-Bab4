package addressbook;

import java.util.Scanner;

/**
 *
 * @author Istighfarin Bahtiar Amry
 * @NIM 155150401111129
 * @Kelas SI-H
 */
public class AddressBook {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Data konstruktor = new Data("Universitas Brawijaya", "Malang", 12345, "ub@gmail.com");
        System.out.println("        ===ADDRESS BOOK UNIVERSE===");
        System.out.println("");
        konstruktor.showKonstruk();
        System.out.println();
        System.out.print("Banyak Data Masukkan :");
        int x = in.nextInt(); //untuk mengisi berapa banyak index array
        Data[] masukan = new Data[x];
        for (int i = 0; i < masukan.length; i++) {
            masukan[i] = new Data();
        }
        for (int i = 0; i < masukan.length; i++) { //perulangan untuk masukan
            System.out.println("    ========DATA " + (i + 1) + "=========");
            System.out.println();
            System.out.print("Masukkan Nama    : ");
            masukan[i].setName(in.next());
            System.out.print("Masukkan Alamat  : ");
            masukan[i].setAddress(in.next());
            System.out.print("Masukkan No.Telp : ");
            masukan[i].setNocall(in.nextInt());
            System.out.print("Masukkan E-Mail  : ");
            masukan[i].setEmail(in.next());
        }
         

}}
