import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {

        intervalChecker(questionMethod());
    }


    public static void intervalChecker(int value) {

        boolean mainRange = (value >= 0 && value <= 100);
        boolean firstRange = (value >= 0 && value <= 14);
        boolean secondRange = (value >= 15 && value <= 35);
        boolean thirdRange = (value >= 36 && value <= 50);

        if (mainRange) {
            if (firstRange) {
                System.out.println("Value " + value + " in range from 0 to 14");
            } else if (secondRange) {
                System.out.println("Value " + value + " in range from 15 to 35");
            } else if (thirdRange) {
                System.out.println("Value " + value + " in range from 36 to 50");
            } else {
                System.out.println("Value " + value + " in range from 50 to 100");
            }


        } else {
            System.out.println("ERROR: Value must be integer and in range from 0 to 100");
        }
    }


    public static int questionMethod() {

        Scanner scan = new Scanner(System.in);
        int value;

        System.out.println("Please input integer value in range from 0 to 100");
        value = scan.nextInt();

        return value;
    }
}
