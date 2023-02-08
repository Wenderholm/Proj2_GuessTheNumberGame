import java.util.Scanner;

public class NowyTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String secret = "example-text";
        String displaySecret = "";
        for (int i = 0; i < secret.length(); i++)
            displaySecret += "*";

        String guess = sc.nextLine();
        int position = secret.indexOf(guess);

        String newDisplaySecret = "";
        for (int i = 0; i < secret.length(); i++)
            if (i == position) newDisplaySecret += secret.charAt(i); //newly guessed character
            else newDisplaySecret += displaySecret.charAt(i); //old state

        displaySecret = new String(newDisplaySecret);

    }
}
