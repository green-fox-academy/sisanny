//Create an empty map where the keys are integers and the values are characters
//Print out whether the map is empty or not
//Add the following key-value pairs to the map
//Print all the keys
//Print all the values
//Add value D with the key 68
//Print how many key-value pairs are in the map
//Print the value that is associated with key 99
//Remove the key-value pair where with key 97
//Print whether there is an associated value with key 100 or not
//Remove all the key-value pairs

import java.util.HashMap;

public class MapIntro1 {
  public static void main(String[] args) {

    HashMap<Integer, Character> numbersAndCharacters = new HashMap<>();
    System.out.println(numbersAndCharacters.isEmpty());
    numbersAndCharacters.put(97, 'a');
    numbersAndCharacters.put(98, 'b');
    numbersAndCharacters.put(99, 'c');
    numbersAndCharacters.put(65, 'A');
    numbersAndCharacters.put(66, 'B');
    numbersAndCharacters.put(67, 'C');
    for (Integer key : numbersAndCharacters.keySet()) {
      System.out.println(key);
    }
    for (Character value : numbersAndCharacters.values()) {
      System.out.println(value);
    }
    numbersAndCharacters.put(68, 'D');
    System.out.println(numbersAndCharacters.size());
    System.out.println(numbersAndCharacters.get(99));
    numbersAndCharacters.remove(97);
    System.out.println(numbersAndCharacters.containsKey(100));
    numbersAndCharacters.clear();
  }
}
