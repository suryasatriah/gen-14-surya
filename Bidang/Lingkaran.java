
/**
 * @author : Surya Satria Hidayat
 * 
 */

package Bidang;

public class Lingkaran {
    private double radius;
    private double luasLingkaran;
    private double kelilingLingkaran;

    public Lingkaran() {

    }

    public Lingkaran(double radius) {
        this.radius = radius;
    }

    //setter untuk parameter di lingkaran
    public void setRadius(double radius) throws Exception {
        if (radius > 0) {
            this.radius = radius;
        } else {
            throw new Exception("Radius tidak boleh nol atau bernilai negatif");
        }
    }

    //Getter luas lingkaran
    public double getLuasLingkaran() {
        return luasLingkaran;
    }

    //Getter keliling lingkaran
    public double getKelilingLingkaran(){
        return kelilingLingkaran;
    }

    //Perhitungan luas lingkaran
    public void HitungLuasLingkaran(){
        luasLingkaran = Math.PI * radius * radius;
    }
    
    //Perhitungan keliling lingkaran
    public void HitungKelilingLingkaran(){
        kelilingLingkaran = 2 * Math.PI * radius;
    }
}
