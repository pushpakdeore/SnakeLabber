import java.util.*;
public class SnakeLadder {
    public static void main(String[] args) {
        int position = 0; // Start position

        System.out.println("Starting the Snake and Ladder game...");

        // Roll the die and print the result
        int dieRoll = rollDie();
        System.out.println("Rolled a " + dieRoll);

    }
    public static int rollDie() {
        Random random = new Random();
        return random.nextInt(6) + 1; // Generates a random number between 1 and 6
    }

}

