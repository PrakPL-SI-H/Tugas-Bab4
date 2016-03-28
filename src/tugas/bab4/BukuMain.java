/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAPORAN;

import java.util.Scanner;

/**
 *
 * @author TEGAR
 */
public class BukuMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        Buku[] user = new Buku[5];
        for (int i = 0; i < user.length; i++) {
            user[i]= new Buku();   
        }
         for (int i = 0; i < user.length; i++) {
            System.out.println("PENGISIAN BUKU DATA PRIBADI");
            System.out.println("===========================");
            System.out.println("Masukkan Nama anda       : ");
            user[i].setName(in.next());
            System.out.println("Masukkan Alamat anda     : ");
            user[i].setAddress(in.next());
            System.out.println("Masukkan No.Telepon anda : ");
            user[i].setNumber(in.next());
            System.out.println("Masukkan Email anda      : ");
            user[i].setEmail(in.next());  
    }
} 
}