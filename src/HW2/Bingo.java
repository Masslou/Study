package HW2;


import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {

        Bingo(randomValue());

    }

    public static int randomValue() {

        final Random random = new Random();
        return random.nextInt(101);

    }


    public static void Bingo(int a) {
        int usersValue;
        int numOfAttemps = 0;
        int template = a;


        do {

            Scanner scan = new Scanner(System.in);
            System.out.println("Let's play Bingo! Pick a positive integer between 0 and 100");
            usersValue = scan.nextInt();

            if (template > usersValue) {

                System.out.println("My number is bigger");
                numOfAttemps++;

            } else if (template < usersValue) {

                System.out.println("Your number is bigger than mine");
                numOfAttemps++;

            } else {

                System.out.println("Congratulations! You guessed from: ");
                break;
            }


        } while (randomValue() != usersValue);
        {
            System.out.println("Attemps numer " + numOfAttemps);
        }

    }

}


