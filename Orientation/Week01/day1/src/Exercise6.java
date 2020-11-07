//Write a Stream Expression to find the uppercase characters in a string!

import java.util.stream.Stream;

public class Exercise6 {
    public static void main(String[] args) {

        Stream.of("blabla")
                //.map(letter -> letter.chars())
                .forEach(System.out::println);
    }
}
