import java.util.Scanner;

public class HCF_LCM {

    // Recursive method to find HCF using Euclid's algorithm
    static int hcf(int a, int b) {
        if (b == 0) {
            return a;
        }
        return hcf(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int hcfValue = hcf(num1, num2);
        int lcmValue = (num1 * num2) / hcfValue; // Formula: LCM = (a*b) / HCF

        System.out.println("HCF: " + hcfValue);
        System.out.println("LCM: " + lcmValue);

        sc.close();
    }
}
// This program calculates the HCF and LCM of two numbers using recursion.