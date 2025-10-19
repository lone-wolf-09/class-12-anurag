import java.util.Scanner;

public class FibonacciRecursion {

    // Recursive function to get nth Fibonacci number
    static int fib(int n) {
        if (n <= 1) {
            return n; // Base cases: fib(0) = 0, fib(1) = 1
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter how many terms to print: ");
        int terms = sc.nextInt();
        
        System.out.println("Fibonacci Series:");
        for (int i = 0; i < terms; i++) {
            System.out.print(fib(i) + " ");
        }
        
        sc.close();
    }
}
// This program prints the Fibonacci series up to the specified number of terms using recursion.