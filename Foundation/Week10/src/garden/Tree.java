package garden;

public abstract class Tree extends Plant {

  public Tree(String name, int fertility) {
    super(name, fertility);
  }

  @Override
  public boolean needsWater() {
    if (getWaterAmount() < 10);
    return true;
  }

  @Override
  public void water(int waterAmountToGive, int numberOfWaterables) {
    int absorbedWater = (int)((waterAmountToGive/numberOfWaterables) * 0.1);
    if(height < 500) {
      height += fertility;
    }
    if (needsWater()) {
      waterAmount += absorbedWater;
      System.out.println("The " + name + " needs water");
      } else {
      System.out.println("The " + name + " does not need water");
    }
  }
}
