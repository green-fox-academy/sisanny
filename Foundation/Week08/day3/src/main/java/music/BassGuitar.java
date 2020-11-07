package main.java.music;

public class BassGuitar extends StringInstument {

  public BassGuitar(String nameOfIntrument, int numberOfStrings) {
    this.nameOfIntrument = nameOfIntrument;
    this.numberOfStrings = numberOfStrings;
  }

  public BassGuitar() {
    this("Bass Guitar", 4);
  }

  public BassGuitar(int numberOfStrings) {
    nameOfIntrument = "Bass Guitar";
    this.numberOfStrings = numberOfStrings;
  }

  @Override
  public String sound() {
    return "Duum-duum-duum";
  }

  @Override
  public void play() {
    System.out.println(nameOfIntrument + ", a " + numberOfStrings + "-stringed instrument that goes " + sound());
  }
}
