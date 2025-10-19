import java.util.Scanner;

public class UniqueNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isUnique(num)) {
            System.out.println(num + " is a Unique Number ✅");
        } else {
            System.out.println(num + " is NOT a Unique Number ❌");
        }

        sc.close();
    }

    public static boolean isUnique(int num) {
        boolean[] digits = new boolean[10]; // For digits 0-9

        while (num > 0) {
            int digit = num % 10;
            if (digits[digit]) {
                return false; // Digit already seen
            }
            digits[digit] = true;
            num /= 10;
        }
        return true;
    }
}
