package datastructures;

import java.util.HashMap;
import java.util.Map;

public class ShoppingList {
  HashMap<String, Double> listBob = new HashMap<String, Double>();
  HashMap<String, Double> listAlice = new HashMap<String, Double>();


  public int howMuchHePaid(HashMap<String, Double> shoppingList) {
    double paid = 0;

    HashMap<String, Double> productsPrices = new HashMap<String, Double>();
    productsPrices.put("Milk", 1.07);
    productsPrices.put("Rice", 1.59);
    productsPrices.put("Eggs", 3.14);
    productsPrices.put("Cheese", 12.60);
    productsPrices.put("Chicken breasts", 9.40);
    productsPrices.put("Apples", 2.31);
    productsPrices.put("Tomato", 2.58);
    productsPrices.put("Potato", 1.75);
    productsPrices.put("Onion", 1.10);

    for (Map.Entry<String, Double> shopping : shoppingList.entrySet()) {
      double priceValue = productsPrices.get(shopping.getKey());
      paid += (shopping.getValue() * priceValue);
    }
    return (int) paid;
  }

  public String whoBuysMore(HashMap<String, Double> shoppingList, HashMap<String, Double> shoppingList2, String product) {

      if (shoppingList.get(product) > shoppingList2.get(product)) {
        return "Alice";
      }
      return "Bob";
  }
}