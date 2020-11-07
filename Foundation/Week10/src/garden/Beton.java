package garden;

public class Beton implements Waterable {

  @Override
  public void water(int waterAmount, int numberOfWaterables) {
    System.out.println("Beton is watered.");
  }
}
