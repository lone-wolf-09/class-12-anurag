import java.util.Scanner;

public class PerfectNumber {

    static boolean isPerfect(int num) {
        if (num <= 1) return false; // 1 is not a perfect number

        int sum = 0;

        // Check divisors
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (isPerfect(number)) {
            System.out.println(number + " is a Perfect Number ✅");
        } else {
            System.out.println(number + " is NOT a Perfect Number ❌");
        }

        sc.close();
    }
}
// This program checks if a number is a Perfect Number using a simple iterative approach.