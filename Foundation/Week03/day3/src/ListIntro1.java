//Create an empty list which will contain names (strings)
//Print out the number of elements in the list
//Add William to the list
//Print out whether the list is empty or not
//Add John to the list
//Add Amanda to the list
//Print out the number of elements in the list
//Print out the 3rd element
//Iterate through the list and print out each name
//William
//John
//Amanda
//Iterate through the list and print
//1. William
//2. John
//3. Amanda
//Remove the 2nd element
//Iterate through the list in a reversed order and print out each name
//Amanda
//William
//Remove all elements

import java.util.ArrayList;

public class ListIntro1 {
  public static void main(String[] args) {

    ArrayList<String> names = new ArrayList<String>();
    System.out.println(names.size());

    names.add("Williem");
    if (names.size() == 0) {
      System.out.println("The list is empty.");
    } else {
      System.out.println("The number of elements in the list is: " + names.size());
    }
    names.add("John");
    names.add("Amanda");
    System.out.println(names.size());
    System.out.println(names.get(2));
    for (int i = 0; i < names.size(); i++) {
      System.out.println(names.get(i));

    names.remove(1);
    for (int j = names.size() - 1; j >= 0; j--) {
      System.out.println(names.get(j));

     names.clear();
      }
    }
  }
}
