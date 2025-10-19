import java.util.*;

public class BinaryDecimalConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Conversion:");
        System.out.println("1. Binary to Decimal");
        System.out.println("2. Decimal to Binary");
        System.out.print("Enter choice (1 or 2): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter Binary number: ");
                String binary = sc.next();
                int decimalValue = Integer.parseInt(binary, 2);
                System.out.println("Decimal value: " + decimalValue);
                break;

            case 2:
                System.out.print("Enter Decimal number: ");
                int decimal = sc.nextInt();
                String binaryValue = Integer.toBinaryString(decimal);
                System.out.println("Binary value: " + binaryValue);
                break;

            default:
                System.out.println("Invalid choice! Please select 1 or 2.");
        }

        sc.close();
    }
}
// This program converts between Binary and Decimal number systems based on user choice.