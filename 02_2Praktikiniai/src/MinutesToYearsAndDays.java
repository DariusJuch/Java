import java.util.Scanner;

public class MinutesToYearsAndDays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of minutes: ");
        int minutes = sc.nextInt();

        int minutesInYear = 60 * 24 * 365;
        int years = minutes / minutesInYear;
        int remainingMinutes = minutes % minutesInYear;
        int days = remainingMinutes / (60 * 24);

        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
    }
}
