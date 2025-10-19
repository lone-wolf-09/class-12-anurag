import java.util.Scanner;

public class CompositeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num <= 1) {
            System.out.println(num + " is neither prime nor composite.");
            return;
        }

        boolean isComposite = false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isComposite = true;
                break;
            }
        }

        if (isComposite)
            System.out.println(num + " is a Composite Number.");
        else
            System.out.println(num + " is NOT a Composite Number.");
    }
}
// This code checks if a number is composite by checking for factors other than 1 and itself.