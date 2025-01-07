
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Password?");
        String message = scan.nextLine();
        String pass = "Caput Draconis";
        if (message.equals(pass) ) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }
    }
}
