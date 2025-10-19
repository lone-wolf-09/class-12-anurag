import java.util.*;

public class TigerNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int temp = num;
        int sumDigits = 0;
        int sumSquares = 0;
        
        while (temp > 0) {
            int digit = temp % 10;
            sumDigits += digit;
            sumSquares += digit * digit;
            temp /= 10;
        }
        
        if (sumSquares % sumDigits == 0) {
            System.out.println(num + " is a Tiger Number 🐅");
        } else {
            System.out.println(num + " is NOT a Tiger Number ❌");
        }
    }
}
// This program checks if a number is a Tiger Number (the sum of the squares of its digits is divisible by the sum of its digits).