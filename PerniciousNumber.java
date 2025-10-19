import java.util.*;

public class PerniciousNumber {
    // Function to check if a number is prime
    static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Count number of 1's in binary representation
        int countOnes = Integer.bitCount(n);

        // Check if that count is prime
        if (isPrime(countOnes)) {
            System.out.println(n + " is a Pernicious Number");
        } else {
            System.out.println(n + " is NOT a Pernicious Number");
        }

        sc.close();
    }
}
