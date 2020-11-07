// Write a program that asks for a double that is a distance in miles,
// then it converts that value to kilometers and prints it

import java.util.Scanner;
public class MileToKilometerConverter {
    public static void main(String[] args) {
        System.out.println("Type the number of miles that you want to convert into km:");
        Scanner scanner = new Scanner(System.in);
        double userInput1 = Double.parseDouble(scanner.nextLine());
        System.out.println(userInput1 / 1.6);
    }
}
