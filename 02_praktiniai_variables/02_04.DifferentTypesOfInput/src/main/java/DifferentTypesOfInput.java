
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String str1 = scan.nextLine();
        System.out.println("Give an integer:");
        int num1 = Integer.parseInt(scan.nextLine());
        System.out.println("Give a double:");
        double dou1 = Double.parseDouble(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean trueOrFalse = Boolean.valueOf(scan.nextLine());
        System.out.println("You gave the string " + str1);
        System.out.println("You gave the integer " + num1);
        System.out.println("You gave the double " + dou1);
        System.out.println("You gave the boolean " + trueOrFalse);


    }
}
