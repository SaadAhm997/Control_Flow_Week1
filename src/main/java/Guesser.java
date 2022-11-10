import java.util.Scanner;

public class Guesser {
    public static void main(String[] args) {

        // Creating user input and storing it:
        System.out.println("Please input a number from 1 to 10: ");
        Scanner reader = new Scanner(System.in);
        int guess = reader.nextInt();

        // Creating a secret number:
        int secretNumber = 7;

        // Control flow to provide answer:
        if (guess == secretNumber) {
            System.out.println("You have correctly guessed the secret number! :)");
        } else if (guess > secretNumber) {
            System.out.println("Your guess is too high!");
        } else if (guess < secretNumber) {
            System.out.println("your guess is too low!");
        }


    }
}
