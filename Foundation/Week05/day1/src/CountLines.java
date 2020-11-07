// Write a function that take a filename as a string,
// then returns the number of the lines the file contains.
// It should return zero if it can not find the file, and
// should not raise any error.

import java.awt.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
  public static void main(String[] args) {
    countTheNumberOfLinesInTheFile("my-file.txt");
  }

  public static void countTheNumberOfLinesInTheFile(String fileName) {
    Path filePath = Paths.get(fileName);
    try {
      List<String> lines = Files.readAllLines(filePath);
      System.out.println(lines.size());
    } catch (Exception e) {
      System.out.println(0);
    }
  }
}
