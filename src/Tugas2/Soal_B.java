
/**
 * SOAL B
 * 
 * @author Surya Satria Hidayat
 */

import java.util.Scanner;

public class Soal_B {
    public static void main(String[] args) {

        int n;

        // Scanner untuk memasukkan nilai n
        Scanner scanner = new Scanner(System.in);
        System.out.println("Soal B");
        System.out.println("masukkan nilai n: ");
        n = scanner.nextInt();

        PenyelesaianSoal_B(n);

        scanner.close();
    }

    private static void PenyelesaianSoal_B(int n) {
        // Solusi untuk soal B
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) == (n - 1)) {
                    System.out.print("#");
                }
                if (i == j) {
                    if ((i == j) != ((i + j) == (n - 1))) {
                        System.out.print("#");
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}