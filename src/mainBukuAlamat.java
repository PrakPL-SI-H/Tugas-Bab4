package Encapsulation;
import java.util.Scanner;
public class mainBukuAlamat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BukuAlamat book = new BukuAlamat();
        book.create();
        book.cetak();
    }
}
