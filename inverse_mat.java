import java.util.Scanner;

public class MatrixInverse2x2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] matrix = new double[2][2];

        System.out.println("Enter 2x2 matrix elements:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                matrix[i][j] = sc.nextDouble();

        double determinant = matrix[0][0]*matrix[1][1] - matrix[0][1]*matrix[1][0];

        if (determinant == 0) {
            System.out.println("Inverse doesn't exist (Determinant is zero).");
        } else {
            double[][] inverse = new double[2][2];

            // Applying inverse formula for 2x2
            inverse[0][0] =  matrix[1][1] / determinant;
            inverse[0][1] = -matrix[0][1] / determinant;
            inverse[1][0] = -matrix[1][0] / determinant;
            inverse[1][1] =  matrix[0][0] / determinant;

            System.out.println("Inverse of the matrix is:");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(inverse[i][j] + "\t");
                }
                System.out.println();
            }
        }

        sc.close();
    }
}
