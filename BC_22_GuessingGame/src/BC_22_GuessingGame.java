import java.util.Scanner;
import java.util.Random;

public class BC_22_GuessingGame {
    public static void main(String[] args) throws Exception {

        // Number Guessing Game

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int guessedNumber;
        int attempts = 0;
        int min = 1;
        int max = 20;
        int randomNumber = random.nextInt(min, max + 1);

        System.out.println("Number Guessing Game");
        System.out.printf("This program will pick a random number between %d and %d. \n", min, max);
        System.out.println("You must guess what this number is.");

        // For testing purposes
        // System.out.println("Random number: " + randomNumber);

        do{
            System.out.print("Enter your guess: ");
            guessedNumber = sc.nextInt();
            attempts += 1;
            // attempts++; would also work
            if(guessedNumber < randomNumber){
                System.out.println("Guess too low.");
            }
            else if(guessedNumber > randomNumber){
                System.out.println("Guess too high.");
            }
            else{
            System.out.println("The correct guess is:  " + randomNumber );
            System.out.println("You guessed correctly in " + attempts + " tries!");
            }
        }while(guessedNumber != randomNumber);


        sc.close();
    }
}
