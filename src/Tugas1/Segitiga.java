
/**
 * @author : Surya Satria Hidayat
 * 
 */
package src.Tugas1;

public class Segitiga {
    private double alas;
    private double tinggi;
    private double luasSegitiga;
    private double sisi1;
    private double sisi2;
    private double sisi3;
    private double kelilingSegitiga;

    public Segitiga() {
    }

    public Segitiga(double alas, double tinggi, double sisi1, double sisi2, double sisi3) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }


    //Setter parameter untuk segitiga
    public void setAlas(double alas) {
        this.alas = alas;
    }

    public void setTinggi(double tinggi) throws Exception {
        if (tinggi > 0) {
            this.tinggi = tinggi;
        } else {
            throw new Exception("Tinggi tidak boleh nol atau bernilai negatif");
        }
    }

    public void setSisi1(double sisi1) throws Exception {
        if (sisi1 > 0) {
            this.sisi1 = sisi1;
        } else {
            throw new Exception("Sisi tidak boleh nol atau bernilai negatif");
        }
    }

    public void setSisi2(double sisi2) throws Exception {
        if (sisi2 > 0) {
            this.sisi2 = sisi2;
        } else {
            throw new Exception("Sisi tidak boleh nol atau bernilai negatif");
        }
    }

    public void setSisi3(double sisi3) throws Exception {
        if (sisi3 > 0) {
            this.sisi3 = sisi3;
        } else {
            throw new Exception("Sisi tidak boleh nol atau bernilai negatif");
        }
    }

    //Getter luas segitiga
    public double getLuasSegitiga() {
        return luasSegitiga;
    }

    //Getter keliling segitiga
    public double getKelilingSegitiga() {
        return kelilingSegitiga;
    }

    //Perhitungan luas segitiga
    public void HitungluasSegitiga() {
        luasSegitiga = 0.5 * tinggi * alas;
    }

    //Perhitungan keliling segitiga
    public void HitungKelilingSegitiga() {
        kelilingSegitiga = sisi1 + sisi2 + sisi3;
    }

}