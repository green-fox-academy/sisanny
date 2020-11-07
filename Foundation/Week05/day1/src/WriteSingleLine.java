// Write a function that is able to manipulate the file
// By writing your name into it as a single line
// The file should be named as my-file.txt
// Ine case the program is unbale to write the file
// It should print: Unable to write the file

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteSingleLine {
  public static void main(String[] args) {
    writeSingleLine("Anna");
  }

  public static void writeSingleLine(String yourContent) {
    try {
      List<String> content = new ArrayList<>();
      Path filePath = Paths.get("my-file.txt");
      content.add(yourContent);
      Files.write(filePath, content);
    } catch (Exception e) {
      System.out.println("Unable to write the file");
    }
  }
}
