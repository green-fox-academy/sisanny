// Create a program that asks for a number and prints the multiplication table with that number
//
// Example:
// The number 15 should print:
//
// 1 * 15 = 15
// 2 * 15 = 30
// 3 * 15 = 45
// 4 * 15 = 60
// 5 * 15 = 75
// 6 * 15 = 90
// 7 * 15 = 105
// 8 * 15 = 120
// 9 * 15 = 135
// 10 * 15 = 150

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args){
        System.out.println("Please write a number that you wish to see the multiplication table of: ");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            int result = i * userInput;
            System.out.println(i + " " + "*" + " " + userInput + " " + "=" + " " + result);
        }
    }
}
