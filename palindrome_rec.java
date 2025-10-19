import java.util.Scanner;

public class PalindromeRecursion {

    // Recursive function to check palindrome
    static boolean isPalindrome(String str, int start, int end) {
        // Base case: If pointers cross, it's a palindrome
        if (start >= end) 
            return true;

        // If characters at start and end don't match
        if (str.charAt(start) != str.charAt(end)) 
            return false;

        // Move inward
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine().toLowerCase(); // case-insensitive

        if (isPalindrome(input, 0, input.length() - 1)) {
            System.out.println("Palindrome ✅");
        } else {
            System.out.println("Not a Palindrome ❌");
        }

        sc.close();
    }
}
