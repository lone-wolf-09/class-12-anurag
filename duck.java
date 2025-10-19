import java.util.Scanner;

public class DuckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String num = sc.next();

        // Check if first digit is zero
        if (num.charAt(0) == '0') {
            System.out.println("Not a Duck Number ❌ (starts with zero)");
            return;
        }

        // Check if it contains zero anywhere else
        if (num.contains("0")) {
            System.out.println("Duck Number 🦆✅");
        } else {
            System.out.println("Not a Duck Number ❌");
        }
    }
}
// This program checks if a number is a Duck Number (contains zero but does not start with zero).