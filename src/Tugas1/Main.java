
/**
 * @author : Surya Satria Hidayat
 * Class untuk melakukan inpun parameter dan atribut bidang datar, serta menampilkan array hasil perhitungan
 */

import Bidang.BelahKetupat;
import Bidang.Lingkaran;
import Bidang.Persegi;
import Bidang.Segitiga;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        // Salah satu contoh apabila nilai ingin diinputkan. Bidang yang perlu input
        // adalah radius lingkaran
        Scanner a = new Scanner(System.in);
        double radiuslingkaran;
        System.out.println("Masukkan radius lingkaran: ");
        radiuslingkaran = a.nextDouble();

        // Salah satu contoh apabila nilai ingin diinputkan. Bidang yang perlu input
        // adalah sisi persegi
        double sisipersegi;
        System.out.println("Masukkan sisi persegi: ");
        sisipersegi = a.nextDouble();
        a.close();

        // Mengatur input setter untuk bidang lingkaran. Tidak bisa diinput dari cmd
        // karena tidak pakai scanner
        Segitiga segitiga = new Segitiga();
        segitiga.setAlas(4.0);
        segitiga.setTinggi(3.0);
        segitiga.setSisi1(4.0);
        segitiga.setSisi2(3.0);
        segitiga.setSisi3(5.0);
        segitiga.HitungluasSegitiga();
        segitiga.HitungKelilingSegitiga();

        // Mengatur input setter untuk bidang persegi. Nilai diinput dari sistem saat
        // program di compile
        Persegi persegi = new Persegi();
        persegi.setSisi(sisipersegi);
        persegi.HitungLuasPersegi();
        persegi.HitungKelilingPersegi();

        // Mengatur input setter untuk bidang lingkaran. Nilai diinput dari sistem saat
        // program di compile
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.setRadius(radiuslingkaran);
        lingkaran.HitungLuasLingkaran();
        lingkaran.HitungKelilingLingkaran();

        // Mengatur input setter untuk bidang belah ketupat. Tidak bisa diinput dari cmd
        // karena tidak pakai scanner
        BelahKetupat belahketupat = new BelahKetupat();
        belahketupat.setDiagonal1(10.0);
        belahketupat.setDiagonal2(15.0);
        belahketupat.setSisi1(4.0);
        belahketupat.setSisi2(6.0);
        belahketupat.HitungLuasBelahKetupat();
        belahketupat.HitungKelilingBelahKetupat();

        // Membuat array yang menyimpan hasil perhitungan luas segitiga, lingkaran,
        // belahketupat, dan persegi

        double[] LuasBidang = new double[4];
        LuasBidang[0] = segitiga.getLuasSegitiga();
        LuasBidang[1] = lingkaran.getLuasLingkaran();
        LuasBidang[2] = belahketupat.getLuasBelahKetupat();
        LuasBidang[3] = persegi.getLuasPersegi();
        // Membuat array yang menyimpan hasil perhitungan keliling segitiga, lingkaran,
        // belahketupat, dan persegi

        double[] KelilingBidang = new double[4];
        KelilingBidang[0] = segitiga.getKelilingSegitiga();
        KelilingBidang[1] = lingkaran.getKelilingLingkaran();
        KelilingBidang[2] = belahketupat.getKelilingBelahKetupat();
        KelilingBidang[3] = persegi.getKelilingPersegi();

        // Array untuk memberikan string didepan nilai luas saat menampilkan array luas
        // bidang.
        String[] LuasNamaBidang = new String[4];
        LuasNamaBidang[0] = "Luas Segitiga : ";
        LuasNamaBidang[1] = "Luas Lingkaran : ";
        LuasNamaBidang[2] = "Luas Belah Ketupat : ";
        LuasNamaBidang[3] = "Luas Persegi : ";

        // Array untuk memberikan string didepan nilai keliling saat menampilkan array
        // keliling bidang.
        String[] KelilingNamaBidang = new String[4];
        KelilingNamaBidang[0] = "Keliling Segitiga : ";
        KelilingNamaBidang[1] = "Keliling Lingkaran : ";
        KelilingNamaBidang[2] = "Keliling Belah Ketupat : ";
        KelilingNamaBidang[3] = "Keliling Persegi : ";

        // Menampilkan array hasil perhitungan luas bidang datar
        for (int i = 0; i < LuasBidang.length; i++) {
            System.out.println(LuasNamaBidang[i] + LuasBidang[i]);
        }

        // Menampilkan array hasil perhitungan keliling bidang datar
        for (int i = 0; i < KelilingBidang.length; i++) {
            System.out.println(KelilingNamaBidang[i] + KelilingBidang[i]);
        }
    }
}
