//Write a function, that takes a string as an argument and returns a dictionary
// with all letters in the string as keys, and numbers as values that shows how many occurrences there are.
//Create a test for that.

package count;

import java.util.HashMap;

public class Counter {

  public HashMap makeADictionary(String word) {
    HashMap<Character, Integer> wordDictionary = new HashMap<>();

    for (int i = 0; i < word.length(); i++) {
      char letter = word.charAt(i);
      if (!wordDictionary.containsKey(letter)) {
        wordDictionary.put(letter, 0);
      }
        wordDictionary.put(letter, wordDictionary.get(letter) + 1);
    }
    return wordDictionary;
  }
}
