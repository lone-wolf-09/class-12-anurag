import java.util.Scanner;

public class PrimeFactorial {
    // Function to check prime
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Function to calculate factorial
    static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isPrime(num)) {
            System.out.println(num + " is Prime ✅");
            System.out.println("Factorial of " + num + " = " + factorial(num));
        } else {
            System.out.println(num + " is NOT Prime ❌");
        }

        sc.close();
    }
}
// This code checks if a number is prime and calculates its factorial if it is prime.