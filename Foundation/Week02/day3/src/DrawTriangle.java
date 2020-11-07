// Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was

import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        System.out.println("Please write a number to indicate how big the triangle should be:");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        String star = "";
        for (int i = 0; i < userInput; i++) {
            System.out.println(star += "*");
        }
    }
}
