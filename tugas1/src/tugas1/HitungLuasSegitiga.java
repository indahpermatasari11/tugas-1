package tugas1;

import java.util.Scanner;

public class HitungLuasSegitiga {
    public static void main(String[] args) {
        // Deklarasi variabel
        double alas, tinggi, luas;

        // Meminta pengguna untuk memasukkan panjang alas
        try ( // Membuat objek Scanner untuk mengambil input dari pengguna
                Scanner input = new Scanner(System.in)) {
            // Meminta pengguna untuk memasukkan panjang alas
            System.out.print("Masukkan panjang alas segitiga: ");
            alas = input.nextDouble();
            // Meminta pengguna untuk memasukkan tinggi segitiga
            System.out.print("Masukkan tinggi segitiga: ");
            tinggi = input.nextDouble();
            // Menghitung luas segitiga
            luas = 0.5 * alas * tinggi;
            // Menampilkan hasil luas segitiga
            System.out.println("Luas segitiga adalah: " + luas);
            // Menutup objek Scanner
        }
    }
}
