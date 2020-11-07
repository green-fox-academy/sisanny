package garden;

public class Main {
  public static void main(String[] args) {
    Garden garden = new Garden();

    garden.buildElement(new Rose());
    garden.buildElement(new Palm());
    garden.buildElement(new Apple());
    garden.buildElement(new Tulip());
    garden.buildElement(new Beton());
    garden.water(100, garden.countWaterables());
  }
}
