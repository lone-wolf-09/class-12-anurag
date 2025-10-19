import java.util.*;

public class VampireNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long num = sc.nextLong();

        if (isVampire(num)) {
            System.out.println(num + " is a Vampire Number 🦇✅");
        } else {
            System.out.println(num + " is NOT a Vampire Number ❌");
        }
    }

    public static boolean isVampire(long num) {
        String numStr = String.valueOf(num);
        int len = numStr.length();

        // Vampire number must have even number of digits
        if (len % 2 != 0) return false;

        int halfLen = len / 2;
        long start = (long) Math.pow(10, halfLen - 1);
        long end = (long) Math.pow(10, halfLen);

        char[] numChars = numStr.toCharArray();
        Arrays.sort(numChars);

        for (long i = start; i < end; i++) {
            if (num % i == 0) {
                long j = num / i;
                if (String.valueOf(j).length() == halfLen) {
                    // Check if digits match
                    String fangPair = i + "" + j;
                    char[] fangChars = fangPair.toCharArray();
                    Arrays.sort(fangChars);
                    if (Arrays.equals(numChars, fangChars)) {
                        // Both fangs should not end with 0 simultaneously
                        if (!(i % 10 == 0 && j % 10 == 0)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
// This program checks if a number is a Vampire Number (can be expressed as the product of two numbers with the same digits).