import java.util.Scanner;
public class Goldbash {
    public boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }

    public void goldbach(int n) {
        if (n <= 2 || n % 2 != 0) {
            System.out.println("!!!!!Only for even numbers > 2");
            return;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (isPrime(i) && isPrime(n - i)) {
                System.out.println(n + " = " + i + " + " + (n - i));
                return;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Goldbach's Conjecture");
        System.out.println("Every even integer greater than 2 can be expressed as the sum of two prime numbers.");
        Goldbash obj = new Goldbash();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an even number greater than 2: ");
        int number = scanner.nextInt();
        obj.goldbach(number);
        scanner.close();
        System.out.println("Check completed.");
    }
}
