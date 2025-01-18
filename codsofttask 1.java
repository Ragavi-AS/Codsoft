package codsofttask1;
import java.util.Random;
import java.util.Scanner;
public class cosofttask1 {
	    private static final int MAX_ATTEMPTS = 10;
	    private static Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        System.out.println("Welcome to the Number Guessing Game!");
	        boolean playAgain;
	        int score = 0;

	        do {
	            boolean wonRound = playRound();
	            if (wonRound) {
	                score++;
	            }
	            System.out.println("Your current score: " + score);
	            playAgain = askToPlayAgain();
	        } while (playAgain);

	        System.out.println("Thank you for playing! Your final score is: " + score);
	        scanner.close();
	    }

	   
	    private static boolean playRound() {
	        Random random = new Random();
	        int numberToGuess = random.nextInt(100) + 1; 
	        int attempts = 0;

	        System.out.println("\nStarting a new round...");
	        System.out.println("You have " + MAX_ATTEMPTS + " attempts to guess the number between 1 and 100.");

	        while (attempts < MAX_ATTEMPTS) {
	            int guess = getUserGuess();
	            attempts++;
	            if (guess == numberToGuess) {
	                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
	                return true; 
	            } else if (guess < numberToGuess) {
	                System.out.println("Too low!");
	            } else {
	                System.out.println("Too high!");
	            }
	        }

	        System.out.println("You've used all attempts! The correct number was " + numberToGuess + ".");
	        return false; 
	    }

	    
	    private static int getUserGuess() {
	        System.out.print("Enter your guess: ");
	        while (!scanner.hasNextInt()) {
	            System.out.println("Invalid input! Please enter a number.");
	            scanner.next(); 
	            System.out.print("Enter your guess: ");
	        }
	        return scanner.nextInt();
	    }

	   
	    private static boolean askToPlayAgain() {
	        System.out.print("Do you want to play again? (yes/no): ");
	        String response = scanner.next();
	        return response.equalsIgnoreCase("yes");
	    }
	
}
