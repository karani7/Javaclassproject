import java.util.Scanner;
import java.util.Random;
public class GuessingGame {
    public static void main(String[] args){
        //1.Setup
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int targetNumber = random.nextInt(100)+1;
        int attemptsLeft = 7;
        boolean hasWon = false;

        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("Can you guess it?You Have"+attemptsLeft+"tries");

        //2.The Loop (Control Flow)
        while (attemptsLeft > 0){
            System.out.print("\nEnter your guess:");
            int userGuess = scanner.nextInt();
            attemptsLeft--;

            if (userGuess == targetNumber){
                hasWon = true;
                break;
            }else if (userGuess > targetNumber){
                System.out.println("Too high!Tries left:"+attemptsLeft);
            }else{
                System.out.println("Too low! Tries left:"+attemptsLeft);
            }
        }
        //3.Game over Logic
        if (hasWon){
            System.out.println("\nCongratulations! You guessed it with"+attemptsLeft+" tries remaining");
        }else{
            System.out.println("\nGame over!The number was:"+targetNumber);
        }
        scanner.close();
    }
}
