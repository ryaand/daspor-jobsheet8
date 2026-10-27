import java.util.Scanner;

public class Tugas307 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahToko = 0;
        int totalBarangSeluruhToko = 0;
        int maxBarangToko = -1;
        int tokoTerbanyak = 1;
        do {
            System.out.print("Masukkan jumlah toko (minimal 1): ");
            jumlahToko = sc.nextInt();
            if (jumlahToko < 1) {
                System.out.println("Jumlah toko harus minimal 1! Silakan coba lagi.");
            }
        } while (jumlahToko < 1);
        for (int i = 1; i <= jumlahToko; i++) {
            System.out.println(" Toko " + i);
            int jumlahPelanggan = 0;
            do {
                System.out.print(" Masukkan jumlah pelanggan: ");
                jumlahPelanggan = sc.nextInt();
                if (jumlahPelanggan < 0) {
                    System.out.println(" Jumlah pelanggan tidak boleh negatif!");
                }
            } while (jumlahPelanggan < 0);
            int totalBarangToko = 0;
            for (int j = 1; j <= jumlahPelanggan; j++) {
                int barang = 0;
                do {
                    System.out.print("  Pelanggan " + j + " - jumlah barang: ");
                    barang = sc.nextInt();
                    if (barang < 0) {
                        System.out.println("  Jumlah barang tidak boleh negatif!");
                    }
                } while (barang < 0);
                totalBarangToko += barang;
            }
            System.out.println("Toko " + i + " - pelanggan: " + jumlahPelanggan + ", total barang: " + totalBarangToko);
            totalBarangSeluruhToko += totalBarangToko;
            if (totalBarangToko > maxBarangToko) {
                maxBarangToko = totalBarangToko;
                tokoTerbanyak = i;
            }
        }
        System.out.println("==================================");
        System.out.println("Total barang seluruh toko: " + totalBarangSeluruhToko);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
        sc.close();
    }
}