import java.util.Scanner;

public class percobaan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bilangan yang dihitung: ");
        int bilangan = sc.nextInt();
        System.out.print("Pangkat: ");
        int Pangkat = sc.nextInt();

        System.out.println(hitungPangkat(bilangan, Pangkat, 1));
    }

    static int hitungPangkat(int x, int y, int hasilhipo ) {
        if (y == 0) {
            System.out.print("1 = ");
            return hasilhipo;
        } else {
            System.out.print(x + " x ");
            return hitungPangkat(x, y - 1, hasilhipo * x);
        }
    }
    
}
