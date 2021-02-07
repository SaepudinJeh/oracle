package coba;

import java.util.Scanner;

public class NewClass {
    
    public static void main(String[] args) {
        //komentar
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan jumlah galon = ");
        int gallons=scan.nextInt();
        double liters = gallons*3.785;
        System.out.println("jumlah =" +gallons+"Gallons = "+liters+" Liters");
    }
}