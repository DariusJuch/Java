import java.text.DecimalFormat;
import java.util.Scanner;

public class Miles {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

        System.out.println("Enter miles: ");
        int miles = Integer.parseInt(sc.nextLine());
        double kilometers = miles * 1.6;
        DecimalFormat df = new DecimalFormat("0.0");
        System.out.println( miles + " miles is " + df.format(kilometers)  + " kilometers");


    }
}
