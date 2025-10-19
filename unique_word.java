import java.util.Scanner;

public class VowelWordCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.nextLine().toLowerCase();

        // Check first and last character
        if (isVowel(word.charAt(0)) && isVowel(word.charAt(word.length() - 1))) {
            System.out.println(word + " ✅ starts and ends with a vowel.");
        } else {
            System.out.println(word + " ❌ does not start and end with a vowel.");
        }
    }

    public static boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }
}
// This code checks if a word starts and ends with a vowel.