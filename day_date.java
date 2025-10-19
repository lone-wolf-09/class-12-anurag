import java.util.Scanner;

public class DayNumberToDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Days in each month (non-leap year)
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] monthNames = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };

        System.out.print("Enter day number (1-365): ");
        int dayNumber = sc.nextInt();

        if (dayNumber < 1 || dayNumber > 365) {
            System.out.println("Invalid day number ❌");
            return;
        }

        int month = 0;
        while (dayNumber > daysInMonth[month]) {
            dayNumber -= daysInMonth[month];
            month++;
        }

        System.out.println("Date: " + dayNumber + " " + monthNames[month] + " 📅");
    }
}
