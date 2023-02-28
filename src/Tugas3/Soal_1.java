package src.Tugas3;

/**
 * SOAL 1
 * 
 * @author Surya Satria Hidayat
 */

 import java.util.Scanner;

public class Soal_1 {
    public static void main(String[] args) {
        String kalimat;

        // Scanner untuk memasukkan kalimat
        Scanner scanner = new Scanner(System.in);
        System.out.println("Soal 1");
        System.out.println("ketikkan kalimat: ");
        kalimat = scanner.nextLine();

        PenyelesaianSoal_1(kalimat);

        scanner.close();
    }

    private static void PenyelesaianSoal_1(String kalimat) {
        // Solusi untuk soal 1
        kalimat = kalimat.toLowerCase();
        int counta = 0, counti = 0, countu = 0, counte = 0, counto = 0;

        for(char huruf : kalimat.toCharArray()){
            if (huruf == 'a'){
                counta++;
            } else if (huruf == 'i'){
                counti++;
            } else if (huruf == 'u'){
                countu++;
            } else if (huruf == 'e'){
                counte++;
            } else if (huruf =='o'){
                counto++;
            }
        }
        System.out.println("a = " + counta);
        System.out.println("i = " + counti);
        System.out.println("u = " + countu);
        System.out.println("e = " + counte);
        System.out.println("o = " + counto);
    }
}