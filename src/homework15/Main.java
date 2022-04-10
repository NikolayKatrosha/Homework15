package homework15;

import java.util.Scanner;

import static homework15.RockPaperScissors.*;

public class Main {

    static String playerName;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        playerName = scanner.nextLine();
        System.out.println("How many rounds of Rock-Paper-Scissors would you like to play?");
        int rounds = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < rounds; i++) {
            playRockPaperScissors(scanner);
        }
        System.out.println("Statistic for player: " + playerName + ",");
        System.out.println("Score: ");
        System.out.println("      player:   " + playerScore + " points");
        System.out.println("      computer: " + computerScore + " points");

    }
}
