package src.Tugas4;

import java.io.Serializable;

public class Barang implements Serializable {
    private String nama;
    private int harga;
    private int persediaan;

    public Barang(){
        super();
    }
    
    public Barang(String nama, int harga, int persediaan){
        super();
        this.nama = nama;
        this.harga = harga;
        this.persediaan = persediaan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getHarga() {
        return harga;
    }

    public void getHarga(int harga) {
        this.harga = harga;
    }

    public int getPersediaan() {
        return persediaan;
    }

    public void getPersediaan(int persediaan) {
        this.persediaan = persediaan;
    }
    
    @Override
    public String toString() {
        return (
            "nama: " + this.nama + ", harga: " + this.harga + ", persediaan: " + this.persediaan
        );
    }

    


    
}
