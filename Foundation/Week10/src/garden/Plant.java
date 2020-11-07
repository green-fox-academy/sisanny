package garden;

public abstract class Plant implements Waterable{
  protected String name;
  protected int waterAmount = 0;
  protected int height;
  protected int fertility;


  public Plant(String name, int fertility){
    this.name = name;
    this.fertility = fertility;
  }

  public int getWaterAmount() {
    return waterAmount;
  }

  public abstract boolean needsWater();

  public abstract void water(int waterAmountToGive, int numberOfWaterables);
}
