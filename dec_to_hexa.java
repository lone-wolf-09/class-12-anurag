import java.util.Scanner;
public class DecToHexa {
    int dec;
    
    DecToHexa(int d) {
        dec = d;
    }
    
    String convertToHex() {
        StringBuilder hex = new StringBuilder();
        int n = dec;
        while (n > 0) {
            int remainder = n % 16;
            if (remainder < 10) {
                hex.insert(0, remainder);
            } else {
                hex.insert(0, (char) ('A' + remainder - 10));
            }
            n /= 16;
        }
        return hex.toString();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();
        DecToHexa converter = new DecToHexa(decimalNumber);
        String hexValue = converter.convertToHex();
        System.out.println("Hexadecimal value: " + hexValue);
        scanner.close();
    }
}
// This program converts a decimal number to its hexadecimal representation.
// It reads a decimal number from the user, converts it to hexadecimal, and prints the result.
// The conversion is done by repeatedly dividing the number by 16 and using the remainder to build the hexadecimal string.
// Hexadecimal digits are represented as 0-9 for values 0-9 and A-F for values 10-15.
// The program uses a StringBuilder to efficiently construct the hexadecimal string.