package src.Fibonnaci;

import java.util.Scanner;

public class Soal_3 {
    public static void main(String[] args) {
        // Scanner untuk memasukkan angka
        Scanner scanner = new Scanner(System.in);
        System.out.println("masukkan nilai n : ");
        int n = scanner.nextInt();

        PenyelesaianSoal(n);

        scanner.close();
    }

    private static void PenyelesaianSoal(int n) {
        int[]fibo = Fibonnaci.buatFibo(n);

        String arah = "kanan";

        int tengah = (int) Math.floor(n/2);
        for (int baris = 0; baris < n; baris++){
            int index = 0;
            for (int kolom= 0; kolom < n; kolom++){
                if (arah.equals("kanan")){
                    if (index >= tengah){
                        arah = "kiri";
                    }
                } else {
                    if (index==0){
                        arah = "kanan";
                    }
                }
                //cetak

                if (baris == kolom || baris + kolom == n-1){
                    System.out.print(fibo[index] + " ");
                } else {
                    System.out.print(" ");
                }

                if (arah.equals("kanan")) index++;
                if (arah.equals("kiri")) index--;
            }
            System.out.println();
        }

    }
}
