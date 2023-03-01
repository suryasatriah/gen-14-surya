package src.Fibonnaci;

import java.util.Scanner;

public class Soal_2b {
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

        //soal 2b

        int angka1 = 0;
        int angka2 = 1;
        int angka3 = 0;

        System.out.print(angka1 + " " + angka2 + " ");

        for(int i = 2; i < (n/2); i++){
            angka3 = angka1 + angka2;

            System.out.print(angka3 + " ");

            angka1 = angka2;
            angka2 = angka3;
        }

        System.out.print(angka1 + " ");

        while (angka3 > 0){
            angka3 = angka2 - angka1;
            System.out.print(angka3 + " ");

            angka2 = angka1;
            angka1 = angka3;
        }
    }
}
