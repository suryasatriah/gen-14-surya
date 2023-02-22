
/**
 * SOAL A
 * 
 * @author Surya Satria Hidayat
 */

import java.util.Scanner;

public class Soal_A {
    public static void main(String[] args) {

        int n;

        // Scanner untuk memasukkan nilai n
        Scanner scanner = new Scanner(System.in);
        System.out.println("Soal A");
        System.out.println("masukkan nilai n: ");
        n = scanner.nextInt();

        PenyelesaianSoal_A(n);

        scanner.close();
    }

    private static void PenyelesaianSoal_A(int n) {
        // Solusi untuk soal A
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}