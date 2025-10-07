import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String PlayerA, PlayerB, playAgain;

        do {
            do {
                System.out.print("Player A, enter your move (R, P, S): ");
                PlayerA = in.nextLine().toUpperCase();
            } while (!PlayerA.equals("R") && !PlayerA.equals("P") && !PlayerA.equals("S"));

            do {
                System.out.print("Player B, enter your move (R, P, S): ");
                PlayerB = in.nextLine().toUpperCase();
            } while (!PlayerB.equals("R") && !PlayerB.equals("P") && !PlayerB.equals("S"));

            if (PlayerA.equals(PlayerB)) {
                System.out.println(PlayerA + " vs " + PlayerB + " — It's a Tie!");
            } else if ((PlayerA.equals("R") && PlayerB.equals("S")) || (PlayerB.equals("R") && PlayerA.equals("S"))) {
                System.out.println("Rock breaks Scissors");
                System.out.println(PlayerA.equals("R") ? "Player A wins" : "Player B wins");
            } else if ((PlayerA.equals("P") && PlayerB.equals("R")) || (PlayerB.equals("P") && PlayerA.equals("R"))) {
                System.out.println("Paper covers Rock");
                System.out.println(PlayerA.equals("P") ? "Player A wins" : "Player B wins");
            } else {
                System.out.println("Scissors cuts Paper");
                System.out.println(PlayerA.equals("S") ? "Player A wins" : "Player B wins");
            }

            // Ask to play again
            System.out.print("Do you want to play again? [Y/N]: ");
            playAgain = in.nextLine().toUpperCase();

        } while (playAgain.equals("Y"));

        System.out.println("Thanks for playing!");
        in.close();
    }
}