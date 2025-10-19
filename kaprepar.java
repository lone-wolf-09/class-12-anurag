import java.util.*;

public class KaprekarNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int square = n * n;
        String sqStr = String.valueOf(square);

        // Split the square into two parts
        int len = sqStr.length();
        String leftPart = (len == 1) ? "0" : sqStr.substring(0, len / 2);
        String rightPart = sqStr.substring(len / 2);

        int left = Integer.parseInt(leftPart);
        int right = Integer.parseInt(rightPart);

        if (left + right == n) {
            System.out.println(n + " is a Kaprekar Number ✅");
        } else {
            System.out.println(n + " is NOT a Kaprekar Number ❌");
        }

        sc.close();
    }
}
// This code checks if a number is a Kaprekar number.
// A Kaprekar number is a number whose square can be split into two parts that sum to the original number.