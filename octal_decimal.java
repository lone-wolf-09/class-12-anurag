import java.util.*;

public class OctalDecimalConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Choose an option:");
        System.out.println("1. Octal to Decimal");
        System.out.println("2. Decimal to Octal");
        int choice = sc.nextInt();
        
        switch (choice) {
            case 1:
                System.out.print("Enter Octal number: ");
                String octal = sc.next();
                int decimal = Integer.parseInt(octal, 8); // Convert base-8 to decimal
                System.out.println("Decimal value: " + decimal);
                break;
                
            case 2:
                System.out.print("Enter Decimal number: ");
                int dec = sc.nextInt();
                String oct = Integer.toOctalString(dec); // Convert decimal to base-8
                System.out.println("Octal value: " + oct);
                break;
                
            default:
                System.out.println("Invalid choice!");
        }
        
        sc.close();
    }
}
// This program converts between Octal and Decimal number systems based on user choice.