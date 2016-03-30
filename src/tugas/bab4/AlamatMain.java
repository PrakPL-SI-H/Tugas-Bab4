/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.bab4;

import java.util.Scanner;

/**
 *
 * @author kevinnaphan
 */
public class AlamatMain {
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       DaftarAlamat a = new DaftarAlamat();
       int pilih = 0;
       do {
           System.out.println("Daftar Buku Alamat");
           System.out.println("1.Memasukan Daftar Buku Alamat");
           System.out.println("2.Melihat Daftar Nama");
           System.out.println("3.Menampilkan Nama dan Data ");
           System.out.println("4.Keluar ");
           
           System.out.print("Masukan Pilihan : ");
           pilih = in.nextInt();
           
           switch (pilih){
               case 1 : 
               
                   System.out.print("Masukan Nama : ");
                   String nama = in.next();
                   System.out.print("Masukan Alamat : ");
                   String alamat = in.next();
                   System.out.print("Masukan Nomor Telepon : ");
                   String nomor = in.next();
                   System.out.print("Masukan Email : ");
                   String em = in.next();
                   a.isiAlamat( nama, alamat, nomor, em);
                   break;
               case 2 : a.getDaftar();
                   
               case 3 : System.out.print("Masukan Nomor Yg ingin diliat daftarnya : ");
                   int i = in.nextInt();
                   System.out.println("Nama   :"+a.getNama(i));
                   System.out.println("Alamat :"+a.getAlamat(i));
                   System.out.println("Nomor  :"+a.getNomor(i));
                   System.out.println("Email  :"+a.getEmail(i));
                   
                   break;    
               case 4 : break;    
                   
                   
                   
                   
                   
                   
                   
                   
                   
           }
           
           
       }while(pilih!=4);
    }
}
