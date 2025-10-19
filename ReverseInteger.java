import java.util.*;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        int original = num; 
        int rev = 0;
        sc.close();
        while (num != 0) {
            int digit = num % 10;   // Get last digit
            rev = rev * 10 + digit; // Append digit
            num /= 10;              // Remove last digit
        }

        System.out.println("Reverse of " + original + " is: " + rev);
    }
}
