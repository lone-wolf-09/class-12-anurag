import java.util.Scanner;

public class MagicNumber {
    // Function to find sum of digits
    static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp = num;

        // Keep reducing the number to a single digit
        while (temp > 9) {
            temp = sumOfDigits(temp);
        }

        if (temp == 1) {
            System.out.println(num + " is a Magic Number ✨✅");
        } else {
            System.out.println(num + " is NOT a Magic Number ❌");
        }
    }
}
// This program checks if a number is a Magic Number (reduces to 1 by summing its digits repeatedly).