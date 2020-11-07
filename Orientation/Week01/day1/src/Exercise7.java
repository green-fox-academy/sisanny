import java.util.Arrays;
import java.util.List;

//Write a Stream Expression to find the strings which starts with a given letter(as parameter), in the following list:

public class Exercise7 {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");

        cities.stream()
                .filter(c -> c.startsWith("C"))
                .forEach(System.out::println);

    }
}
