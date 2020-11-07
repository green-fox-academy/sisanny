// Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stored number is lower
// You found the number: 8

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int guess = 0;
        int stored = 10;

        while (stored != guess) {
            System.out.println("Type your guess:");
            int userInput = scanner.nextInt();
            guess += userInput;

            if (stored > userInput) {
                System.out.println("The stored number is higher");
            } else if (stored < userInput) {
                System.out.println("The stored number is lower");
            } else {
                System.out.println("You found the number:" + userInput);
                break;
            }
        }
    }
}
