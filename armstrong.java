import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp = num;
        int digits = String.valueOf(num).length(); // number of digits
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        if (sum == num) {
            System.out.println(num + " is an Armstrong Number ✅");
        } else {
            System.out.println(num + " is NOT an Armstrong Number ❌");
        }
    }
}
// This program checks if a number is an Armstrong Number (sum of its digits raised to the power of the number of digits equals the number itself).