// Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one
//
// example:
//
// first number: 3, second number: 6, should print:
//
// 3
// 4
// 5

import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        System.out.println("Please write a number:");
        Scanner scanner = new Scanner(System.in);
        int userInput1 = scanner.nextInt();
        System.out.println("Please write a bigger number than before:");
        int userInput2 = scanner.nextInt();
        if (userInput1 > userInput2) {
            System.out.println("The second number should be bigger");
        } else {
            for (int i = userInput1; i < userInput2; i++) {
                System.out.println(userInput1++);
            }
        }
    }
}
