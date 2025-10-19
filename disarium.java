import java.util.Scanner;

public class DisariumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int length = String.valueOf(num).length(); // total digits
        int temp = num, sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, length); // digit^position
            temp /= 10;
            length--;
        }

        if (sum == num) {
            System.out.println(num + " is a Disarium Number ✅");
        } else {
            System.out.println(num + " is NOT a Disarium Number ❌");
        }
    }
}
// This program checks if a number is a Disarium Number (sum of its digits raised to the power of their respective positions equals the number itself).