import java.util.Scanner;
public class Emirp{
    public boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    public int reverse(int num) {
        int reversed = 0;
        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return reversed;
    }
    public boolean isEmirp(int num) {
        int reversed = reverse(num);
        return isPrime(reversed) && num != reversed;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        emirp obj = new emirp();
        Emirp obj = new Emirp();
        System.out.println("Emirp Number Checker");
        System.out.println("An Emirp is a prime number that becomes a different prime number when its digits are reversed.");
        System.out.print("Check for Emirp numbers (1 to 100): ");
        int start=1, end=100;
        for (int i = start; i <= end; i++) {
            if (obj.isEmirp(i) && obj.isPrime(i)) {
                System.out.print(i + " , ");
            }
        }
        scanner.close();
        System.out.println("Check completed.");
    }
}