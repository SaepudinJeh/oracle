/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Konversi;

import java.util.Scanner;

/**
 *
 * @author seven
 */
public class Konversi {
    
    public static void main(String[] args) {
        //komentar
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan jumlah galon = ");
        int gallons=scan.nextInt();
        double liters = gallons*3.785;
        System.out.println("jumlah =" +gallons+"Gallons = "+liters+" Liters");
    }
}
