//Create a Stream expression which reads all text from this file, and prints the 100 most common words in descending order.
// Keep in mind that the text contains punctuation characters which should be ignored.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class Exercise11 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("Wiki.txt");
        List<String> lines = Files.readAllLines(filePath);


        lines.stream().flatMap(l -> Stream.of(l));
    }
}

