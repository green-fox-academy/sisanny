package garden;

import java.util.ArrayList;
import java.util.List;

public class Garden implements Waterable{
  List<Waterable> waterables = new ArrayList<>();

  public void buildElement(Waterable element) {
    waterables.add(element);
  }
  public int countWaterables() {
    int counter = 0;

    for (int i = 0; i < waterables.size(); i++) {
      if(waterables.get(i) instanceof Plant && ((Plant) waterables.get(i)).needsWater())
      counter++;
    }
    return counter;
  }

  @Override
  public void water(int waterAmount, int numberOfWaterables) {
    System.out.println("Watering with " + waterAmount);
    for (Waterable waterable : waterables) {
      waterable.water(waterAmount, numberOfWaterables);
    }
  }
}
