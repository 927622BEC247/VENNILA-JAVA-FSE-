import java.util.Scanner;
import java.util.Random;

public class  q10{
    public static void main(String[] args) {
        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1; // random number between 1 and 100
        Scanner scanner = new Scanner(System.in);
        int guess = 0;

        System.out.println("Guess the number between 1 and 100!");

        // Loop until the user guesses correctly
        while (guess != targetNumber) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > targetNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed it right.");
            }
        }
        
        scanner.close();
    }
}
