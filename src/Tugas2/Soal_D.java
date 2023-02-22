
/**
 * SOAL C
 * 
 * @author Surya Satria Hidayat
 */
import java.util.Scanner;

public class Soal_D {
    public static void main(String[] args) {

        int n;

        // Scanner untuk memasukkan nilai n
        Scanner scanner = new Scanner(System.in);
        System.out.println("Soal D");
        System.out.println("masukkan nilai n: ");
        n = scanner.nextInt();

        PenyelesaianSoal_D(n);

        scanner.close();
    }

    private static void PenyelesaianSoal_D(int n) {
        // Solusi untuk soal D
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.print(i + j + 1);
                } else if ((i + j) == (n - 1)) {
                    System.out.print(2 * j + 1);
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}