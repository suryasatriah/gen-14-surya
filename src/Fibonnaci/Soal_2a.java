package src.Fibonnaci;

import java.util.Scanner;

public class Soal_2a {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Scanner untuk memasukkan angka
        Scanner scanner = new Scanner(System.in);
        System.out.println("Soal 1");
        System.out.println("masukkan nilai n : ");
        int n = scanner.nextInt();

        PenyelesaianSoal(n);

        scanner.close();
    }

    private static void PenyelesaianSoal(int n) {
        int i;

        for(i = 0; i < (n/2); i++){
            System.out.print(i + " ");
        }

        i -= 1;
        
        while (i > 0){
            i--;
            System.out.print(i + " ");
        }
    }
}
