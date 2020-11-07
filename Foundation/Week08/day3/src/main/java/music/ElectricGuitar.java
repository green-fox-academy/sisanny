package main.java.music;

public class ElectricGuitar extends StringInstument {

  public ElectricGuitar(String nameOfIntrument, int numberOfStrings) {
    this.nameOfIntrument = nameOfIntrument;
    this.numberOfStrings = numberOfStrings;
  }

  public ElectricGuitar(int numberOfStrings) {
    nameOfIntrument = "Electric Guitar";
    this.numberOfStrings = numberOfStrings;
  }

  public ElectricGuitar() {
    this("Electric Guitar", 6);
  }

  @Override
  public String sound() {
    return "Twang";
  }

  @Override
  public void play() {
    System.out.println(nameOfIntrument + ", a " + numberOfStrings + "-stringed instrument that goes " + sound());
  }
}
