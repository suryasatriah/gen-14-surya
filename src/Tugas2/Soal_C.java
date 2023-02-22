
/**
 * SOAL C
 * 
 * @author Surya Satria Hidayat
 */
import java.util.Scanner;

public class Soal_C {
    public static void main(String[] args) {

        int n;

        // Scanner untuk memasukkan nilai n
        Scanner scanner = new Scanner(System.in);
        System.out.println("Soal C");
        System.out.println("masukkan nilai n: ");
        n = scanner.nextInt();

        PenyelesaianSoal_C(n);

        scanner.close();
    }

    private static void PenyelesaianSoal_C(int n) {
        // Solusi untuk soal C
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}