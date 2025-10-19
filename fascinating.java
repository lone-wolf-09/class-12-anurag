import java.util.*;

public class FascinatingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isFascinating(num)) {
            System.out.println(num + " is a Fascinating Number ✨✅");
        } else {
            System.out.println(num + " is NOT a Fascinating Number ❌");
        }
    }

    public static boolean isFascinating(int num) {
        if (num < 100) return false; // Must have at least 3 digits

        String concat = num + "" + (num * 2) + (num * 3);

        for (char c = '1'; c <= '9'; c++) {
            if (concat.indexOf(c) == -1) return false;
        }

        return concat.length() == 9; // Ensure exactly 9 digits
    }
}
// This program checks if a number is a Fascinating Number (the concatenation of the number, its double, and its triple contains all digits from 1 to 9 exactly once).