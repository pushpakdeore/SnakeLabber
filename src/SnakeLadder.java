import java.util.*;
public class SnakeLadder {
    public static void main(String[] args) {
        int position1 = 0, position2 = 0;
        int rollCount1 = 0, rollCount2 = 0;
        boolean player1Turn = true;

        System.out.println("Starting the Snake and Ladder game with 2 players...");

        while (position1 < 100 && position2 < 100) {
            if (player1Turn) {
                rollCount1++;
                position1 = playTurn(position1, rollCount1, "Player 1");
                if (checkWin(position1, "Player 1")) break;
                player1Turn = false;
            } else {
                rollCount2++;
                position2 = playTurn(position2, rollCount2, "Player 2");
                if (checkWin(position2, "Player 2")) break;
                player1Turn = true;
            }
        }
    }

    public static int playTurn(int position, int rollCount, String player) {
        int dieRoll = rollDie();
        System.out.println(player + " Roll " + rollCount + ": Rolled a " + dieRoll);

        int option = checkOption();
        if (option == 0) {
            System.out.println(player + ": No Play. Stay at position " + position);
        } else if (option == 1) {
            if (position + dieRoll <= 100) {
                position += dieRoll;
            }
            System.out.println(player + ": Ladder! Move to position " + position);
        } else {
            position -= dieRoll;
            if (position < 0) {
                position = 0;
            }
            System.out.println(player + ": Snake! Move back to position " + position);
        }
        return position;
    }

    public static boolean checkWin(int position, String player) {
        if (position == 100) {
            System.out.println("Congratulations! " + player + " has won the game!");
            return true;
        }
        return false;
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