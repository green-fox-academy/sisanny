import java.awt.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
  public static void main(String[] args) {

    if (copyFileContent("my-file.txt", "my-file2.txt") == true) {
      System.out.println("The copying was succesful");
    }
  }
  public static boolean copyFileContent(String fileName1, String fileName2) {
    List<String> content = new ArrayList<String>();
    Path filePath1 = Paths.get(fileName1);
    Path filePath2 = Paths.get(fileName2);

    try{
      Files.copy(filePath1, filePath2);
    } catch (Exception e) {
      System.out.println();
    }
    return  true;
  }
}
