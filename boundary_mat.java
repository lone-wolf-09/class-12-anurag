import java.util.Scanner;

public class BoundarySumProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        // Input matrix
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int sumBoundary = 0, sumNonBoundary = 0;
        long productBoundary = 1, productNonBoundary = 1;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 0 || i == rows - 1 || j == 0 || j == cols - 1) {
                    // Boundary element
                    sumBoundary += matrix[i][j];
                    productBoundary *= matrix[i][j];
                } else {
                    // Non-boundary element
                    sumNonBoundary += matrix[i][j];
                    productNonBoundary *= matrix[i][j];
                }
            }
        }

        System.out.println("\nSum of boundary elements: " + sumBoundary);
        System.out.println("Product of boundary elements: " + productBoundary);
        System.out.println("Sum of non-boundary elements: " + sumNonBoundary);
        System.out.println("Product of non-boundary elements: " + productNonBoundary);
    }
}
