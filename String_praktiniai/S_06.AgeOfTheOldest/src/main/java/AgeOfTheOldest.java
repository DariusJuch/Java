
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        while (true) {

            String input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }

            String[] words = input.split(",");

            int age = Integer.parseInt(words[words.length - 1]);

            System.out.println(age);
            if (oldest < age){
                oldest = +age;
//                System.out.println(oldest);
            }
            System.out.println(oldest);
        }
    }
}
