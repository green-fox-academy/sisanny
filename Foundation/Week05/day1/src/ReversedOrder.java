// Create a method that decrypts reversed-order.txt

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {
  public static void main(String[] args) {
    decryptsReversedOrder("reversed-order.txt");
  }

  public static void decryptsReversedOrder(String originalFile) {
    List<String> content = new ArrayList<>();
    List<String> newContent = new ArrayList<>();
    String line = "";

    try {
      Path filePath = Paths.get(originalFile);
      content = Files.readAllLines(filePath);
    } catch (Exception e) {
      System.out.println("Ups, cannot read the file");
    }

    for (int i = 0; i < content.size(); i++) {
      line = line + content.get((content.size() - 1) - i) + "\n";
    }
    newContent.add(line);

    try {
      Path filePath2 = Paths.get("newFile3.txt");
      Files.write(filePath2, newContent);
    } catch (Exception e) {
      System.out.println("Ups, cant write the file");
    }
  }
}
