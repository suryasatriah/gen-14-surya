package src.Fibonnaci;

import java.util.ArrayList;

public class Fibonnaci {
    public static ArrayList<Integer> revfibonnaci(int n) {
        ArrayList<Integer> revfibo = new ArrayList<Integer>();
        
        
        int angka1 = 0;
        int angka2 = 1;
        int angka3 = 0;
        
        revfibo.add(angka1);
        revfibo.add(angka2);
        
        for(int i = 2; i < (n/2); i++){
            angka3 = angka1 + angka2;
            revfibo.add(angka3);
            angka1 = angka2;
            angka2 = angka3;
        }
        revfibo.add(angka1);
        while (angka3 > 0){
            angka3 = angka2 - angka1;
            revfibo.add(angka3);
            angka2 = angka1;
            angka1 = angka3;
        }

        //System.out.println(revfibo);
        return revfibo;
        
    }

    public static int[] buatFibo(int n){
        int[] result = new int[n];
        result[0]=1;
        result[1]=1;
        for (int i=2; i< n; i++) {
            result[i] = result[i-1] + result[i-2];
        }

        return result;
    }   
}


