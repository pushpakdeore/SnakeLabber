import java.util.*;
public class SnakeLadder {
    public static void main(String[] args) {
        int position = 0;
        int rollCount = 0;

        System.out.println("Starting the Snake and Ladder game...");

        while (position < 100) {
            int dieRoll = rollDie();
            rollCount++;
            System.out.println("Roll " + rollCount + ": Rolled a " + dieRoll);

            int option = checkOption();
            if (option == 0) {
                System.out.println("No Play. Stay at position " + position);
            } else if (option == 1) {
                if (position + dieRoll <= 100) {
                    position += dieRoll;
                }
                System.out.println("Ladder! Move to position " + position);
            } else {
                position -= dieRoll;
                if (position < 0) {
                    position = 0;
                }
                System.out.println("Snake! Move back to position " + position);
            }
        }

        System.out.println("Congratulations! You've reached the winning position 100 in " + rollCount + " rolls!");
    }

    public static int rollDie() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }

    public static int checkOption() {
        Random random = new Random();
        return random.nextInt(3);
    }

}
