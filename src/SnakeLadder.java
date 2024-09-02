import java.util.*;
public class SnakeLadder {
    public static void main(String[] args) {
        int position = 0; // Start position
        System.out.println("Starting the Snake and Ladder game...");

        // Roll the die
        int dieRoll = rollDie();
        System.out.println("Rolled a " + dieRoll);

        // Check the option
        int option = checkOption();
        if (option == 0) {
            System.out.println("No Play. Stay at position " + position);
        } else if (option == 1) {
            position += dieRoll;
            System.out.println("Ladder! Move to position " + position);
        } else {
            position -= dieRoll;
            if (position < 0) {
                position = 0;
            }
            System.out.println("Snake! Move back to position " + position);
        }

    }
    public static int rollDie() {
        Random random = new Random();
        return random.nextInt(6) + 1; // Generates a random number between 1 and 6
    }

    public static int checkOption() {
        Random random = new Random();
        return random.nextInt(3); // Generates a random number between 0, 1, 2 (No Play, Ladder, Snake)
    }

}

