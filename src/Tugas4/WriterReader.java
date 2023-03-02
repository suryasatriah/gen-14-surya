package src.Tugas4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class WriterReader {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Barang barang1 = new Barang("Oreo", 5000, 10);
        Barang barang2 = new Barang("Ultra", 6000, 11);
        Barang barang3 = new Barang("Silverqueen", 15000, 20);
        Barang barang4 = new Barang("Pocky", 8000, 30);

        try {
            FileOutputStream f = new FileOutputStream(new File("./src/tugas4/barang.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);

            o.writeObject(barang1);
            o.writeObject(barang2);
            o.writeObject(barang3);
            o.writeObject(barang4);

            o.close();
            f.close();

            FileInputStream fi = new FileInputStream(new File("./src/tugas4/barang.txt"));
            ObjectInputStream oi = new ObjectInputStream(fi);

            Barang barangread1 = (Barang) oi.readObject();
            Barang barangread2 = (Barang) oi.readObject();
            Barang barangread3 = (Barang) oi.readObject();
            Barang barangread4 = (Barang) oi.readObject();

            System.out.println(barangread1.toString());
            System.out.println(barangread2.toString());
            System.out.println(barangread3.toString());
            System.out.println(barangread4.toString());

            oi.close();
            fi.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
