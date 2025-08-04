public class Krishnamurthy {
    public int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++)
            fact *= i;
        return fact;
    }

    public boolean isKrishmuth(int n) {
        int sum = 0; 
        int temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sum + = factorial(digit);
            temp /= 10;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        Krishnamurthy obj = new Krishnamurthy();
        System.out.println("Krishnamurthy Numbers from 1 to 50000:");
        for (int i = 1; i <= 50000; i++) {
            if (obj.isKrishmuth(i))
                System.out.println(i);
        }
    }
}
