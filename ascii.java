import java.util.Scanner;

public class AsciiConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        
        // Convert each char to ASCII
        StringBuilder asciiCodes = new StringBuilder();
        for (int i = 0; i < sentence.length(); i++) {
            asciiCodes.append((int) sentence.charAt(i));
            if (i < sentence.length() - 1) {
                asciiCodes.append(" ");
            }
        }
        
        System.out.println(asciiCodes.toString());
        sc.close();
    }
}
