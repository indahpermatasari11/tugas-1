package tugas3;

import java.util.Scanner;

public class KalkulatorSederhana {
    public static void main(String[] args) {
        // Meminta pengguna untuk memasukkan dua angka bulat
        try ( // Membuat objek Scanner untuk mengambil input dari pengguna
                Scanner input = new Scanner(System.in)) {
            // Meminta pengguna untuk memasukkan dua angka bulat
            System.out.print("Masukkan angka pertama: ");
            int angka1 = input.nextInt();
            System.out.print("Masukkan angka kedua: ");
            int angka2 = input.nextInt();
            // Melakukan operasi matematika
            int penjumlahan = angka1 + angka2;
            int pengurangan = angka1 - angka2;
            int perkalian = angka1 * angka2;
            double pembagian = (double) angka1 / angka2; // Menggunakan cast untuk pembagian
            // Menampilkan hasil operasi
            System.out.println("Hasil Penjumlahan: " + penjumlahan);
            System.out.println("Hasil Pengurangan: " + pengurangan);
            System.out.println("Hasil Perkalian: " + perkalian);
            System.out.println("Hasil Pembagian: " + pembagian);
            // Menutup objek Scanner
        }
    }
}
