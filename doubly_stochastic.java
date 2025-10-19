import java.util.Scanner;

public class DoublyStochasticMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the square matrix: ");
        int n = sc.nextInt();

        double[][] matrix = new double[n][n];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextDouble();
            }
        }

        if (isDoublyStochastic(matrix, n)) {
            System.out.println("The matrix is a Doubly Stochastic (Doubly Markov) matrix.");
        } else {
            System.out.println("The matrix is NOT a Doubly Stochastic (Doubly Markov) matrix.");
        }
    }

    public static boolean isDoublyStochastic(double[][] matrix, int n) {
        // Check non-negativity
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] < 0) return false;
            }
        }

        // Check row sums
        for (int i = 0; i < n; i++) {
            double sum = 0;
            for (int j = 0; j < n; j++) {
                sum += matrix[i][j];
            }
            if (Math.abs(sum - 1.0) > 1e-9) return false; // tolerance for floating point
        }

        // Check column sums
        for (int j = 0; j < n; j++) {
            double sum = 0;
            for (int i = 0; i < n; i++) {
                sum += matrix[i][j];
            }
            if (Math.abs(sum - 1.0) > 1e-9) return false;
        }

        return true;
    }
}
