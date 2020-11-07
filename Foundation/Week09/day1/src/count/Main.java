package count;

import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    HashMap<Integer, Character> dictionary = new HashMap<>();
    Counter c = new Counter();

    dictionary = c.makeADictionary("blablabbi");
    System.out.println(dictionary);
  }
}
