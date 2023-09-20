package tugas5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HitungRataRata {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            boolean lanjut = true;
            
            while (lanjut) {
                try {
                    System.out.print("Masukkan berapa banyak angka yang ingin dihitung: ");
                    int jumlahAngka = input.nextInt();
                    
                    if (jumlahAngka <= 0) {
                        System.out.println("Jumlah angka harus lebih dari 0.");
                    } else {
                        double total = 0;
                        
                        for (int i = 1; i <= jumlahAngka; i++) {
                            System.out.print("Masukkan angka ke-" + i + ": ");
                            double angka = input.nextDouble();
                            total += angka;
                        }
                        
                        double rataRata = total / jumlahAngka;
                        System.out.println("Rata-rata: " + rataRata);
                    }
                    
                    // Memberikan pilihan kepada pengguna untuk melanjutkan atau keluar
                    System.out.print("Apakah Anda ingin melanjutkan? (y/n): ");
                    String pilihan = input.next().toLowerCase();
                    if (!pilihan.equals("y")) {
                        lanjut = false;
                        System.out.println("Terima kasih. Sampai jumpa!");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Input tidak valid. Harap masukkan angka.");
                    input.next(); // Membersihkan buffer input
                }
            }
        }
    }
}
