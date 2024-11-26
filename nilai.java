import java.util.Scanner;

public class nilai {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int N = scanner.nextInt();

        int[] angka = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Masukkan angka ke-" + (N - i) + ": ");
            angka[i] = scanner.nextInt();
        }

        System.out.println("Total dari " + N + " angka yang dimasukkan adalah: " + hitungTotalRekursif(angka, N));
        System.out.println("Total dari " + N + " angka yang dimasukkan adalah: " + hitungTotalIteratif(angka, N));
    }

    public static int hitungTotalRekursif(int[] angka, int N) {
        if (N == 0) {
            return 0;
        } else {
            return angka[N - 1] + hitungTotalRekursif(angka, N - 1);
        }
    }

    public static int hitungTotalIteratif(int[] angka, int N) {
        int total = 0;
        for (int i = 0; i < N; i++) {
            total += angka[i];
        }
        return total;
    }
}