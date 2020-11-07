// Write a program that asks for two numbers
// The first number represents the number of girls that comes to a party, the
// second the boys
// It should print: The party is excellent!
// If the the number of girls and boys are equal and 20 or more people are coming to the party
//
// It should print: Quite cool party!
// If there are 20 or more people coming to the party but the girl - boy ratio is not 1-1
//
// It should print: Average party...
// If there are less people coming than 20
//
// It should print: Sausage party
// If no girls are coming, regardless the count of the people

import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        System.out.println("Type the number of girls:");
        Scanner scanner = new Scanner(System.in);
        int userInput1 = scanner.nextInt();
        System.out.println("Type the number of boys:");
        int userInput2 = scanner.nextInt();
        if (userInput1 == 0) {
            System.out.println("Sausage party");
        } else if ((userInput1 == userInput2) && ((userInput1 + userInput2) >= 20)) {
            System.out.println("This is an excellent party");
        } else if ((userInput1 != userInput2) && ((userInput1 + userInput2) >= 20)) {
            System.out.println("Quite cool party");
        } else if ((userInput1 + userInput2) <= 20) {
            System.out.println("Average party");
        }
    }
}