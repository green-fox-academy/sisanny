package garden;

public abstract class Flower extends Plant {

  public Flower(String name, int fertility) {
    super(name, fertility);
  }

  @Override
  public boolean needsWater() {
    if (waterAmount < 5);
    return true;
  }

  @Override
  public void water(int waterAmountToGive, int numberOfWaterables) {
    int absorbedWater = (int) ((waterAmountToGive / numberOfWaterables) * 0.75);
    if (height < 200) {
      height += fertility * absorbedWater;
    }
    if (needsWater()) {
      waterAmount += absorbedWater;
      System.out.println("The " + name + " needs water");
    } else {
      System.out.println("The " + name + " does not need water");
    }
  }
}
