import java.util.Scanner;

public class CombinationRecursion {

    static int combination(int n, int r) {
        if (r == 0 || r == n) {
            return 1; // Base case
        }
        if (r > n) {
            return 0; // Not possible
        }
        return combination(n - 1, r - 1) + combination(n - 1, r);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter r: ");
        int r = sc.nextInt();

        System.out.println("C(" + n + ", " + r + ") = " + combination(n, r));
    }
}
