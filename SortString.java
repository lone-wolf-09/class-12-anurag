import java.util.*;

public class SortString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        sc.close();

        // Step 1: Split into words and sort
        String[] words = sentence.split("\\s+");
        Arrays.sort(words, String.CASE_INSENSITIVE_ORDER);

        // Step 2: Change vowels to uppercase in each word
        String vowels = "aeiou";
        for (int i = 0; i < words.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (char ch : words[i].toCharArray()) {
                if (vowels.indexOf(Character.toLowerCase(ch)) != -1) {
                    sb.append(Character.toUpperCase(ch));
                } else {
                    sb.append(ch);
                }
            }
            words[i] = sb.toString();
        }

        // Output result
        System.out.println("Result: " + String.join(" ", words));
    }
}
// This code sorts the words in a sentence alphabetically and changes all vowels to uppercase.