package datastructures;

import java.util.HashMap;

public class Main {

  public static void main(String[] args) {
    ShoppingList sh = new ShoppingList();
    HashMap<String, Double> listAlice = new HashMap<String, Double>();
    listAlice.put("Rice", 1.);
    listAlice.put("Eggs", 5.);
    listAlice.put("Chicken breasts", 2.);
    listAlice.put("Apples", 1.);
    listAlice.put("Tomato", 10.);

    HashMap<String, Double> shoppingListBob = new HashMap();
    shoppingListBob.put("Milk", 3.);
    shoppingListBob.put("Rice", 2.);
    shoppingListBob.put("Eggs", 2.);
    shoppingListBob.put("Cheese", 1.);
    shoppingListBob.put("Chicken breasts", 4.);
    shoppingListBob.put("Apples", 1.);
    shoppingListBob.put("Tomato", 2.);
    shoppingListBob.put("Potato", 1.);

    System.out.println(sh.howMuchHePaid(listAlice));
    System.out.println(sh.whoBuysMore(listAlice, shoppingListBob, "Rice"));
  }
}
