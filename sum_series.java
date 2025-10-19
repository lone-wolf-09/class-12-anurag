import java.util.Scanner;

public class SeriesSum {

    // Recursive function to calculate sum of series
    static double sumSeries(int x, int n) {
        if (n == 0)  // Base case
            return 1;
        return Math.pow(x, n) + sumSeries(x, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of x: ");
        int x = sc.nextInt();

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        double sum = sumSeries(x, n);

        System.out.println("Sum of series = " + sum);
        sc.close();
    }
}
// This program calculates the sum of the series x^n + x^(n-1) + ... + x^0 using recursion.