package homework15;

import java.util.Scanner;

import static java.lang.System.exit;

public class RockPaperScissors {

    static int playerScore = 0;
    static int computerScore = 0;

    static void playRockPaperScissors(Scanner scanner) {
        Main main = new Main();
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Rock, Paper, Scissors!");

        while (true) {


            System.out.print("What is your move? To make a move, enter: \"rock\", \"paper\", or \"scissors\". To quit the game, enter Q. ");
            String myMove = in.nextLine();


            if ((myMove.equals("Q")) || (myMove.equals("q"))) {
                System.out.println("Thanks for playing Rock, Paper, Scissors!");
                System.out.println("Statistic for player: " + Main.playerName + ",");
                System.out.println("Score: ");
                System.out.println("      player:   " + playerScore + " points");
                System.out.println("      computer: " + computerScore + " points");

                exit(0);
            }


            if (!myMove.equals("rock") && !myMove.equals("paper") && !myMove.equals("scissors")) {

                System.out.println("Your move isn't valid!");
            } else {
                int rand = (int) (Math.random() * 3);

                String opponentMove = "";
                if (rand == 0) {
                    opponentMove = "rock";
                } else if (rand == 1) {
                    opponentMove = "paper";
                } else {
                    opponentMove = "scissors";
                }
                System.out.println("Opponent move: " + opponentMove);


                if (myMove.equals(opponentMove)) {
                    System.out.println("It's a tie!");
                    playerScore++;
                    computerScore++;

                } else if ((myMove.equals("rock") && opponentMove.equals("scissors")) || (myMove.equals("scissors") && opponentMove.equals("paper")) || (myMove.equals("paper") && opponentMove.equals("rock"))) {
                    System.out.println("You won!");
                    playerScore++;

                } else {
                    computerScore++;
                    System.out.println("You lost!");

                }

            }
        }
    }
}