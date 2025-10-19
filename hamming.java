import java.util.Scanner;

public class HammingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        if (isHamming(num)) {
            System.out.println(num + " is a Hamming Number ✅");
        } else {
            System.out.println(num + " is NOT a Hamming Number ❌");
        }
    }

    public static boolean isHamming(int n) {
        if (n <= 0) return false;
        int[] factors = {2, 3, 5};
        for (int f : factors) {
            while (n % f == 0) {
                n /= f;
            }
        }
        return n == 1;
    }
}
// This program checks if a number is a Hamming Number (only contains the prime factors 2, 3, and 5).