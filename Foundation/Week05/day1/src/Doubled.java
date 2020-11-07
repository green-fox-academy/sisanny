// Create a method that decrypts the duplicated-chars.txt

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {

  public static void main(String[] args) {
    decryptsDuplicatedCharacters("duplicated-chars.txt");
  }
  public static void decryptsDuplicatedCharacters(String originalFileContent) {

    List<String> content = new ArrayList<>();
    List<String> newContent = new ArrayList<>();
    String newLine = "";

    try {
      Path filePath = Paths.get(originalFileContent);
      content = Files.readAllLines(filePath);
    } catch (Exception e) {
      System.out.println("Ups, cant read the file");
    }

      for (int i = 0; i < content.size() ; i++) {
        String line = content.get(i);
        for (int j = 0; j < line.length(); j++) {
          if (j % 2 == 0) {
            char newStrChar = line.charAt(j);
            newLine = newLine + newStrChar ;
          }
        }
        newLine = newLine + "\n";
      }
      newContent.add(newLine);

      try {
        Path filePath2 = Paths.get("newFile.txt");
        Files.write(filePath2, newContent);
      } catch (Exception e) {
        System.out.println("Ups, cant write the file");
      }
    }
  }

