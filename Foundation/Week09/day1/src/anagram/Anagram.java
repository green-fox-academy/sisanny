//Write a function, that takes two strings and returns
// a boolean value based on if the two strings are Anagramms or not.
//Create a test for that.

package anagram;

import java.util.Arrays;

public class Anagram {

  public boolean isAnagram(String word, String otherWord) {
    char[] original = word.toCharArray();
    char[] other = otherWord.toCharArray();

    Arrays.sort(original);
    Arrays.sort(other);
    return Arrays.equals(original, other);
  }
}
