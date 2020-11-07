//Create a list ('List A') which contains the following values
//Apple, Avocado, Blueberries, Durian, Lychee
//Create a new list ('List B') with the values of List A
//Print out whether List A contains Durian or not
//Remove Durian from List B
//Add Kiwifruit to List A after the 4th element
//Compare the size of List A and List B
//Get the index of Avocado from List A
//Get the index of Durian from List B
//Add Passion Fruit and Pomelo to List B in a single statement
//Print out the 3rd element from List A

import java.util.ArrayList;

public class ListIntro2 {
  public static void main(String[] args) {
    ArrayList<String> listA = new ArrayList<>();
    listA.add("Apple");
    listA.add("Avocado");
    listA.add("Durian");
    listA.add("Lychee");

    ArrayList<String> listB = new ArrayList<>();
    listB.addAll(listA);
    System.out.println(listA.contains("Durian"));
    listB.remove("Durian");
    listA.add(4, "Kiwifruit");

    if (listA.size() == listB.size()){
      System.out.println("The two lists have the same sizes");
    } else {
      System.out.println("The two lists don`t have the same sizes");
    }
    listA.indexOf("Avocado");
    listB.indexOf("Durian");
    listB.add("Passion Fruit" + "Pomelo");
    System.out.println(listA.get(2));
  }
}
