
/**
 * @author : Surya Satria Hidayat
 * 
 */
package src.Tugas1;

public class Persegi {
    private double sisi;
    private double luasPersegi;
    private double kelilingPersegi;

    public Persegi(){

    }

    public Persegi(double sisi){
        this.sisi = sisi;
    }

    //Setter untuk parameter di persegi
    public void setSisi(double sisi) throws Exception{
        if (sisi > 0){
            this.sisi = sisi;
        } else {
            throw new Exception("Sisi tidak boleh nol atau bernilai negatif");
        }        
    }

    //Getter luas persegi 
    public double getLuasPersegi(){
        return luasPersegi;
    }

    
    //Getter keliling persegi
    public double getKelilingPersegi(){
        return kelilingPersegi;
    }
    
    //Perhitungan luas persegi
    public void HitungLuasPersegi(){
        luasPersegi = sisi*sisi;
    }

    //Perhitungan keliling persegi
    public void HitungKelilingPersegi(){
        kelilingPersegi = sisi*4;
    }

}
