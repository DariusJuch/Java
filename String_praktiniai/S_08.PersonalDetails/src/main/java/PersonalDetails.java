
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longestName = "";
        int years = 0;
        int count = 0;
        double avgYears = 0;
        while (true) {

            String input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }
            String[] parts = input.split(",");
            if (longestName.length() < parts[0].length()) {
                longestName = parts[0];
            }
            years += Integer.parseInt(parts[1]);
            count++;
            avgYears = (double) years / count;


        }
        System.out.println(longestName);
        System.out.println(avgYears);


    }
}
