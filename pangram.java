public class PangramCheck {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";

        if (isPangram(sentence)) {
            System.out.println("It's a pangram!");
        } else {
            System.out.println("Not a pangram.");
        }
    }

    static boolean isPangram(String str) {
        str = str.toLowerCase();
        for (char c = 'a'; c <= 'z'; c++) {
            if (str.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }
}
// This code checks if a given sentence is a pangram, meaning it contains every letter of the alphabet at least once.