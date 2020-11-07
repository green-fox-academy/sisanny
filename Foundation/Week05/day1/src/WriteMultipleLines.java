import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteMultipleLines {
  public static void main(String[] args) {
    writeMultipleLines("my-file.txt", "Anna", 15);
  }
  public static void writeMultipleLines(String fileName, String yourContent, int numberOfLines) {
    try {
      List<String> content = new ArrayList<>();
      Path filePath = Paths.get(fileName);
      for (int i = 0; i < numberOfLines; i++) {
        content.add(yourContent);
      }
      Files.write(filePath, content);
    } catch (Exception e){
      System.out.println();
    }
  }
}
