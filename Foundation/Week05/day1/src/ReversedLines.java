// Create a method that decrypts reversed-lines.txt

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {
  public static void main(String[] args) {
    decryptsReversedLines("reversed-line.txt");
  }

  public static void decryptsReversedLines(String originalFile) {
    List<String> content = new ArrayList<>();
    List<String> newContent = new ArrayList<>();
    String newLine = "";

    try {
      Path filePath = Paths.get(originalFile);
      content = Files.readAllLines(filePath);
    } catch (Exception e) {
      System.out.println("Ups, cannot read the file");
    }

    for (int i = 0; i < content.size(); i++) {
      String line = content.get(i);
      for (int j = 0; j < line.length(); j++) {
        char newStrChar = line.charAt((line.length() - 1) - j);
        newLine = newLine + newStrChar ;
      }
      newLine = newLine + "\n";
    }
    newContent.add(newLine);

    try {
      Path filePath2 = Paths.get("newFile2.txt");
      Files.write(filePath2, newContent);
    } catch (Exception e) {
      System.out.println("Ups, cant write the file");
    }
  }
}
