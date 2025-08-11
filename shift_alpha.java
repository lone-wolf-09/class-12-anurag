import java.util.*;

public class ConsonantThenVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        String vowels = "aeiouAEIOU";
        StringBuilder cons = new StringBuilder();
        StringBuilder vow = new StringBuilder();

        for (char ch : word.toCharArray()) {
            if (vowels.indexOf(ch) != -1) {
                vow.append(ch);
            } else {
                cons.append(ch);
            }
        }

        String result = cons.toString() + vow.toString();
        System.out.println("Result: " + result);
    }
}
