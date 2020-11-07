//We are going to represent our expenses in a list containing integers.
//Create a list with the following items.
//500, 1000, 1250, 175, 800 and 120
//Create an application which solves the following problems.
//How much did we spend?
//Which was our greatest expense?
//Which was our cheapest spending?
//What was the average amount of our spendings?

import java.util.ArrayList;
import java.util.Collections;

public class PersonalFinance {

  public static void main(String[] args) {
    ArrayList<Integer> spendings = new ArrayList<>();
    spendings.add(500);
    spendings.add(100);
    spendings.add(1250);
    spendings.add(175);
    spendings.add(800);
    spendings.add(120);

    int totalSpent = 0;
    for (int i = 0; i < spendings.size(); i++) {
      totalSpent = totalSpent + spendings.get(i);
    }
    System.out.println(totalSpent + " This is the amount what you spent.");
    System.out.println(Collections.max(spendings) + " This is the greatest amount what you spent.");
    System.out.println(Collections.min(spendings) + " This is the smallest amount what you spent.");

    int average = totalSpent / spendings.size();
    System.out.println(average + " This is the average of what you spent.");
  }
}
