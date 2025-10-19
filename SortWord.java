import java.util.Arrays;
import java.util.Scanner;

public class SortWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input word
        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        // Convert word to character array
        char[] chars = word.toCharArray();

        // Sort characters alphabetically
        Arrays.sort(chars);

        // Convert back to string
        String sortedWord = new String(chars);

        // Output result
        System.out.println("Word in alphabetical order: " + sortedWord);

        sc.close();
    }
}
