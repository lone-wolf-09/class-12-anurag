import java.util.Scanner;

public class DudeneyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int cubeRoot = (int) Math.round(Math.cbrt(num)); // cube root
        int sumDigits = 0;
        int temp = num;

        while (temp > 0) {
            sumDigits += temp % 10;
            temp /= 10;
        }

        if (cubeRoot * cubeRoot * cubeRoot == num && sumDigits == cubeRoot) {
            System.out.println(num + " is a Dudeney Number ✅");
        } else {
            System.out.println(num + " is NOT a Dudeney Number ❌");
        }
    }
}
// This program checks if a number is a Dudeney Number (the cube root of the number equals the sum of its digits).
