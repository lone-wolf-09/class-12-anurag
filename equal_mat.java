import java.util.Scanner;

public class EqualMatrixCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size for both matrices
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];

        System.out.println("\nEnter elements of Matrix 1:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nEnter elements of Matrix 2:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        // Check if matrices are equal
        boolean equal = true;
        for (int i = 0; i < rows && equal; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix1[i][j] != matrix2[i][j]) {
                    equal = false;
                    break;
                }
            }
        }

        if (equal) {
            System.out.println("\n✅ Both matrices are equal.");
        } else {
            System.out.println("\n❌ Matrices are NOT equal.");
        }
    }
}
// This code checks if two matrices are equal by comparing their elements.