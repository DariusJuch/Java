
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        String newName = "";
        String oldName = "";
        while (true) {

            String input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }

            String[] words = input.split(",");

            int age = Integer.parseInt(words[words.length - 1]);

            newName = words[0];
            System.out.println(age);
            if (oldest < age){
                oldest = age;
                oldName = newName;
                System.out.println("name " + newName);
//                System.out.println(oldest);
            }
            System.out.println("Name of the oldest " + oldName);
        }
    }

}
