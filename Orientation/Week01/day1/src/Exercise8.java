//Write a Stream Expression to concatenate a Character list to a string!

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise8 {
    public static void main(String[] args) {
        List<Character> wordChars = Arrays.asList('b', 'l', 'a', 'b', 'l', 'a');

        String wordString = (String) wordChars.stream().map(String::valueOf).collect(Collectors.joining());
        System.out.println(wordString);
    }
}
