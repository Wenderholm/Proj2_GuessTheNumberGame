import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 100) + 1;
        boolean hasWon = false;

        System.out.println("I have randomly choosen the number between 1 and 100");
        System.out.println("Try to guess it");

        Scanner sc = new Scanner(System.in);
        for (int i = 10; i > 0; i--) {
            System.out.println("You have " + (i > 1 ? i + " guesses" : i + " guess") + ". Try again");
            int guessNumber = sc.nextInt();

            if (guessNumber > randomNumber) {
                System.out.println("It's smaller then " + guessNumber + ".");
            }
            if (guessNumber < randomNumber) {
                System.out.println("It's bigger then " + guessNumber + ".");
            }

            if (guessNumber == randomNumber) {
                hasWon = true;
                break;
            }
        }

        if (hasWon) {
            System.out.println("GREAT. YOU WIN");
        } else {
            System.out.println("SORRY YOU LOST.");
            System.out.println("The number was" + randomNumber);
        }
    }

}
