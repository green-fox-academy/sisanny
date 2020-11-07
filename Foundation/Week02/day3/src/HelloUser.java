// Modify this program to greet user instead of the World!
// The program should ask for the name of the user

import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        System.out.println("Type here your name and press enter:");
        Scanner scanner = new Scanner(System.in);
        String userInput1 = scanner.nextLine();

        System.out.println("Hello" + " " + userInput1 + "!");
    }
}
