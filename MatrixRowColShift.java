import java.util.Scanner;
public class MatrixRowColShift {
    int rows, cols;
    int [][] matrix;
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        cols = sc.nextInt();
        matrix = new int[rows][cols];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++)
                matrix[i][j] = sc.nextInt();
        }
        sc.close();
    }
    // Function to shift all rows down (last row to top)
    static void shiftRowsDown(int[][] mat) {
        int rows = mat.length;
        //int cols = mat[0].length;

        int[] temp = mat[rows - 1]; // Save last row

        // Shift all rows down
        for (int i = rows - 1; i > 0; i--) {
            mat[i] = mat[i - 1];
        }

        mat[0] = temp; // Move last row to first
    }

    // Function to shift all columns right (last column to first)
    static void shiftColsRight(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        // Save last column
        int[] temp = new int[rows];
        for (int i = 0; i < rows; i++) {
            temp[i] = mat[i][cols - 1];
        }

        // Shift columns to right
        for (int j = cols - 1; j > 0; j--) {
            for (int i = 0; i < rows; i++) {
                mat[i][j] = mat[i][j - 1];
            }
        }

        // Put last column at first position
        for (int i = 0; i < rows; i++) {
            mat[i][0] = temp[i];
        }
    }

    // Utility to print matrix
    void printMat(int[][] mat) {
        for (int[] row : mat) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MatrixRowColShift mrcs = new MatrixRowColShift();
        mrcs.input();       
        while (true) {
            System.out.println("\nCurrent Matrix:");
            mrcs.printMat(mrcs.matrix);

            System.out.println("\nChoose operation:");
            System.out.println("1. Shift Rows Down");
            System.out.println("2. Shift Columns Right");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 3) {
                System.out.println("Exiting... 🫡");
                break;
            }

            switch (choice) {
                case 1:
                    shiftRowsDown(mrcs.matrix);
                    break;
                case 2:
                    shiftColsRight(mrcs.matrix);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
        sc.close();
        System.out.println("Final Matrix:");

    }
}
