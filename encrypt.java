import java.util.Scanner;

public class VowelEncrypt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        String encrypted = replaceVowels(word);
        System.out.println("Encrypted word: " + encrypted);
    }

    static String replaceVowels(String str) {
        String vowels = "aeiou";
        String vowelsUpper = "AEIOU";
        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (vowels.indexOf(ch) != -1) {
                int idx = vowels.indexOf(ch);
                result.append(vowels.charAt((idx + 1) % 5));
            } else if (vowelsUpper.indexOf(ch) != -1) {
                int idx = vowelsUpper.indexOf(ch);
                result.append(vowelsUpper.charAt((idx + 1) % 5));
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }
}
// This code replaces each vowel in a word with the next vowel in the sequence (a->e, e->i, i->o, o->u, u->a) and handles both lowercase and uppercase vowels.