//Create a map where the keys are strings and the values are strings with the following initial values
//Print all the key-value pairs in the following format
//A Letter to Jo (ISBN: 978-1-60309-452-8)
//Lupus (ISBN: 978-1-60309-459-7)
//Red Panda and Moon Bear (ISBN: 978-1-60309-444-3)
//The Lab (ISBN: 978-1-60309-461-0)
//Remove the key-value pair with key 978-1-60309-444-3
//Remove the key-value pair with value The Lab
//Add the following key-value pairs to the map
//Key	Value
//978-1-60309-450-4	They Called Us Enemy
//978-1-60309-453-5	Why Did We Trust Him?
//Print whether there is an associated value with key 478-0-61159-424-8 or not
//Print the value associated with key 978-1-60309-453-5

import java.util.HashMap;
import java.util.Map;

public class MapIntro2 {
  public static void main(String[] args) {
    HashMap<String, String> bookTitlesAndNumbers = new HashMap<>();
    bookTitlesAndNumbers.put("978-1-60309-452-8","A Letter to Jo");
    bookTitlesAndNumbers.put("978-1-60309-459-7","Lupus");
    bookTitlesAndNumbers.put("978-1-60309-444-3","Red Panda and Moon Bear");
    bookTitlesAndNumbers.put("978-1-60309-461-0","The Lab");

    for (Map.Entry<String,String> entry:bookTitlesAndNumbers.entrySet()) {
      System.out.println(entry.getValue() + " (ISBN " + entry.getKey() + ")");
    }
    bookTitlesAndNumbers.remove("978-1-60309-444-3");
    bookTitlesAndNumbers.values().remove("The Lab");
    bookTitlesAndNumbers.put("978-1-60309-450-4", "They Called Us Enemy");
    bookTitlesAndNumbers.put("978-1-60309-453-5", "Why did we trust him?");
    System.out.println(bookTitlesAndNumbers.get("978-1-60309-453-5"));
  }
}
