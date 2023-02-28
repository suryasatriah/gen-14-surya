package src.Tugas3;

import java.util.Scanner;

public class Soal_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Soal 2");
        System.out.println("Masukkan jumlah uang yang dimilikki: ");
        float uang = scanner.nextFloat();

        PenyelesaianSoal_2(uang);
        
        scanner.close();
    }
    
    private static void PenyelesaianSoal_2(float uang) {
        float oreo = 6000;
        float tanggo = 5000;
        float buavita = 7000;
        float aqua = 3000;
        System.out.println("barang yang dapat dibeli dengan uang sebesar " + uang + " adalah : ");
        
        if (uang < aqua){
            System.out.println("tidak ada");
        }

        while (uang > 3000){
            if (uang - buavita >= 0) {
                uang = uang - buavita;
                System.out.println("buavita");
            } else if (uang - oreo >= 0) {
                uang = uang - oreo;
                System.out.println("oreo");
            } else if (uang - tanggo >= 0){
                uang = uang - tanggo;
                System.out.println("tanggo");
            } else if (uang - aqua >= 0){
                uang = uang - aqua;
                System.out.println("aqua");
            } 
        }

        System.out.println("Sisa uang sebesar: " + uang);
    }
}
