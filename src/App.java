import java.util.Random;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {  
    
    // create scanner
    Scanner scanner = new Scanner(System.in);
    
    // main loop
    while (true) {
        // rock paper or scissors array
        String[] rps = { "r", "p", "s" };
        // random move for computer
        String computerMove = rps[new Random().nextInt(rps.length)];

        String playerMove;

        // loop to check if move is valid
        while (true) {
            System.out.println("Please enter your move (r, p, or s)");
            playerMove = scanner.nextLine();
            // check if valid
            if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
                break;
            }
            // error message
            System.out.println(playerMove + " is not a valid move.");
        }

        // print computers move
        System.out.println("Computer played: " + computerMove);

        // check if moves are the same
        if (playerMove.equals(computerMove)) {
            System.out.println("The game was a tie!");
        }

        // goes through all possible move combinations and prints out results

        else if (playerMove.equals("r")) {
            if (computerMove.equals("p")) {
                System.out.println("You lose!");

            } else if (computerMove.equals("s")) {
                System.out.println("You win!");
            }
        }

        else if (playerMove.equals("p")) {
            if (computerMove.equals("r")) {
                System.out.println("You win!");

            } else if (computerMove.equals("s")) {
                System.out.println("You lose!");
            }
        }

        else if (playerMove.equals("s")) {
            if (computerMove.equals("p")) {
                System.out.println("You win!");

            } else if (computerMove.equals("r")) {
                System.out.println("You lose!");
            }
        }

        System.out.println("Play again? (y/n)");
        String playAgain = scanner.nextLine();

        if (!playAgain.equals("y")) {
            break;
        }
    }
    // closes loop and scanner
    scanner.close();
  }
}
;
