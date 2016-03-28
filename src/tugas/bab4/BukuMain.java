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
    }
} 
