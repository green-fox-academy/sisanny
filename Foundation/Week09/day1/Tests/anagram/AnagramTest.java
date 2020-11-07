package anagram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AnagramTest {
  Anagram newA = new Anagram();

  Boolean result = newA.isAnagram("anna", "nana");

  @Test
  public void testIfIsAnagramMethodFindAnagrams() {
    assertEquals(true, result);
  }

}