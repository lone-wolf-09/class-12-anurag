import java.util.Scanner;

public class SymmetricSkewDecomposition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the order of square matrix: ");
        int n = sc.nextInt();
        int[][] A = new int[n][n];

        System.out.println("Enter elements of matrix A:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        double[][] S = new double[n][n];
        double[][] K = new double[n][n];

        // Calculate Symmetric (S) and Skew-Symmetric (K) parts
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                S[i][j] = (A[i][j] + A[j][i]) / 2.0;
                K[i][j] = (A[i][j] - A[j][i]) / 2.0;
            }
        }

        // Print results
        System.out.println("\nSymmetric Matrix (S):");
        printMatrix(S);

        System.out.println("\nSkew-Symmetric Matrix (K):");
        printMatrix(K);

        sc.close();
    }

    public static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("%6.2f ", val);
            }
            System.out.println();
        }
    }
}
