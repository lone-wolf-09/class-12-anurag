public class Pronic {
    public boolean isPronic(int n) {
        for (int i = 0; i * (i + 1) <= n; i++) {
            if (i * (i + 1) == n)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Pronic obj = new Pronic();
        System.out.println("Pronic numbers from 1 to 100:");
        for (int i = 1; i <= 100; i++) {
            if (obj.isPronic(i))
                System.out.print(i + " ");
        }
    }
}
// This program checks for pronic numbers from 1 to 100 and prints them.
// A pronic number is a product of two consecutive integers, i.e., n = i * (i + 1).