import java.util.Scanner;
public class MatTrans {
    int[][] matrix ;
    int rows ;
    int cols ;  
    int[][] transpose ;
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        cols = scanner.nextInt();
        matrix = new int[rows][cols];
        
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        transpose = new int[cols][rows];
    }
    public void transpose(){    // Transposing the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
    }
    

    // function to print a matrix
    public void printMat(int[][] mat) {
        for (int[] row : mat) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        MatTrans obj = new MatTrans();
        obj.input();
        System.out.println("Original Matrix:");
        obj.printMat(obj.matrix);
        obj.transpose();
        System.out.println("Transposed Matrix:");
        obj.printMat(obj.transpose);
    
    }
}
