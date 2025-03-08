import java.util.Random;
import java.util.Scanner;  

public class GuessANumber {
    private static int rnd_number;

    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
        System.out.println( "Can you guess what it is?...");
        makeAGuess();
    }


    private static void makeAGuess(){
	// Create a Scanner object   	 
        // use hasNextDouble to check if input is numeric, 
        // if so...
	// Read user input
        // Compare it with the random number
        // Let the user know the result of the comparison
        // Let the user try again by calling this method recursively
        // Help the user by revealing wether the guess was lower or higher than the target number
        // if input was not numeric show an error message and call this method recursively
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextDouble()){
            double userInput = sc.nextDouble();

            if (userInput == (double)rnd_number){
                System.out.println("Congratulations, you guessed correct. The number i was thinking of was " + rnd_number);
            } else {
                if (userInput > (double)rnd_number){
                    System.out.println("Wanh-wanh. You guessed too high. Try again.");
                    makeAGuess();
                } else {
                    System.out.println("Wanh-wanh. Too low. Try again.");
                    makeAGuess();
                }
            }
        } else{
            System.out.println("The number you typed was not within the numbers given. Try again.");
            makeAGuess();
        }
    }
}
