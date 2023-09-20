package tugas4;

import java.util.Scanner;

public class CekAngkaGenapGanjil {
    public static void main(String[] args) {
        try ( // Membuat objek Scanner untuk mengambil input dari pengguna
                Scanner input = new Scanner(System.in)) {
            while (true) {
                // Meminta pengguna untuk memasukkan angka bulat
                System.out.print("Masukkan angka bulat (0 untuk keluar): ");
                int angka = input.nextInt();
                
                if (angka == 0) {
                    // Keluar dari program jika angka yang dimasukkan adalah 0
                    System.out.println("Terima kasih. Sampai jumpa!");
                    break;
                } else if (angka % 2 == 0) {
                    // Menampilkan pesan jika angka genap
                    System.out.println("Angka genap.");
                } else {
                    // Menampilkan pesan jika angka ganjil
                    System.out.println("Angka ganjil.");
                }
            }
            // Menutup objek Scanner
        }
    }
}
