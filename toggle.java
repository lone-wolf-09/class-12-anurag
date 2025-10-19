import java.util.Scanner;

public class CaseConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch)); // Upper → Lower
            } else if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch)); // Lower → Upper
            } else {
                result.append(ch); // Keep non-alphabet characters same
            }
        }

        System.out.println("Converted string: " + result.toString());
        sc.close();
    }
}
