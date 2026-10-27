import java.util.Scanner;

public class Tugas207 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan nilai n: ");
    int n = sc.nextInt();
    int k = n;
    int jumlahSeluruhAngka = 0;
    for (int i = 1; i <= n; i++) {
      for (int j = i; j <= k; j+=i) {
        if (j >= 10) {
          System.out.print("   " + j);
        } else {
          System.out.print("    " + j);
        }
        jumlahSeluruhAngka += j;
        k = i * 4;
      }
      System.out.println();
    }
    System.out.println("Jumlah seluruh angka: " + jumlahSeluruhAngka);
  }
}
