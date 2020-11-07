//Write a Stream Expression to find the frequency of characters in a given string!

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise9 {
    public static void main(String[] args) {
        //List<String> exampleList = new ArrayList<String>(Arrays.asList(example.split(",")));
        String example = "greenfoxacademy";

        countChars(example);
    }

    //source: https://blog.mshimul.com/calculate-character-frequency-in-string-using-java-stream-api/
    public static Map<String, Long> countChars(String input) {
        Map<String, Long> frequentChars = Arrays.stream(input.toLowerCase().split(""))
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        frequentChars.forEach((k, v) -> System.out.println(k + ":" + v));
        return frequentChars;
    }
}
