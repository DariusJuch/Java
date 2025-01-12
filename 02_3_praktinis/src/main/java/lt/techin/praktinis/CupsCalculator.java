package lt.techin.praktinis;

public class CupsCalculator {

    public void calculateCups(int numberOfCups) {
            int boxes = numberOfCups / 3;
            int remainingCups = numberOfCups % 3;

            System.out.println("Boxes: " + boxes);
            System.out.println("Remaining cups: " + remainingCups);
    }

}
