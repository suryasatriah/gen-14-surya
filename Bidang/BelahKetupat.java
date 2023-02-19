/**
 * @author : Surya Satria Hidayat
 * 
 */

package Bidang;

//Class untuk menghitung luas dan keliling belahketupat.
public class BelahKetupat {
    private double diagonal1;
    private double diagonal2;
    private double luasBelahKetupat;
    private double kelilingBelahKetupat;
    private double sisi1;
    private double sisi2;

    //Constructor untuk bidang belahketupat
    public BelahKetupat(){

    }

    public BelahKetupat(double diagonal1, double diagonal2, double sisi1, double sisi2, double sisi3, double sisi4){
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
    }

    //Setter untuk parameter di belah ketupat
    public void setDiagonal1(double diagonal1) throws Exception{
        if (diagonal1 > 0){
            this.diagonal1 = diagonal1;
        } else {
            throw new Exception("Diagonal tidak boleh nol atau bernilai negatif");
        }
    }

    public void setDiagonal2(double diagonal2) throws Exception{
        if (diagonal2 > 0){
            this.diagonal2 = diagonal2;
        } else {
            throw new Exception("Diagonal tidak boleh nol atau bernilai negatif");
        }
    }

    public void setSisi1(double sisi1) throws Exception{
        if (sisi1 > 0){
            this.sisi1 = sisi1;
        } else {
            throw new Exception("Sisi tidak boleh nol atau bernilai negatif");
        }
    }

    public void setSisi2(double sisi2) throws Exception{
        if (sisi2 > 0){
            this.sisi2 = sisi2;
        } else {
            throw new Exception("Sisi tidak boleh nol atau bernilai negatif");
        }
    }

    
    //Getter luas belah ketupat
    public double getLuasBelahKetupat(){
        return luasBelahKetupat;
    }

    //Getter keliling belah ketupat
    public double getKelilingBelahKetupat(){
        return kelilingBelahKetupat;
    }

    //Perhitungan luas belah ketupat
    public void HitungLuasBelahKetupat(){
        luasBelahKetupat = 0.5 * diagonal1 * diagonal2;
    }
    
    //Perhitungan keliling belah ketupat
    public void HitungKelilingBelahKetupat(){
        kelilingBelahKetupat = (sisi1 + sisi2)*2.0 ;
    }

}