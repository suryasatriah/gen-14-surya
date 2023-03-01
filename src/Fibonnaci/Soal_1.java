package src.Fibonnaci;

/**
 * SOAL 1
 * 
 * @author Surya Satria Hidayat
 */

 import java.util.Scanner;

public class Soal_1 {
    public static void main(String[] args) {
        // Scanner untuk memasukkan angka
        Scanner scanner = new Scanner(System.in);
        System.out.println("Soal 1");
        System.out.println("masukkan nilai n : ");
        int n = scanner.nextInt();

        PenyelesaianSoal_1(n);

        scanner.close();
    }

    private static void PenyelesaianSoal_1(int n) {
        // Solusi untuk soal 1
        int angka1 = 0;
        int angka2 = 1;
        int angka3;

        System.out.print(angka1 + " " + angka2 + " ");

        for(int i = 2; i < n; i++){
            angka3 = angka1 + angka2;

            System.out.print(angka3 + " ");

            angka1 = angka2;
            angka2 = angka3;
        }
    }
}