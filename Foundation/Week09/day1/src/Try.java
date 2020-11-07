import java.util.HashMap;

public class Try {
  public static void main(String[] args) {
    String word = "blablaai";

    HashMap<Integer, Character> wordDictionary = new HashMap<>();
    Integer keyCounter = 0;
    char wordChar;

    for (int j = 0; j < word.length(); j++) {
      wordChar = word.charAt(j);
      for (int i = 0; i < word.length(); i++) {
        if (wordChar == word.charAt(i)) {
          keyCounter += 1;
        }
        if (!wordDictionary.containsValue(word.charAt(i))) {
          wordDictionary.put(keyCounter, word.charAt(i));
        }
      }
    }
  }
}