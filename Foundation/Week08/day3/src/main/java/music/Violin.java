package main.java.music;

public class Violin extends StringInstument {

  public Violin(String nameOfIntrument, int numberOfStrings) {
    this.nameOfIntrument = nameOfIntrument;
    this.numberOfStrings = numberOfStrings;
  }

  public Violin() {
    this("Violin", 4);
  }

  @Override
  public String sound() {
    return "Screech";
  }

  @Override
  public void play() {
    System.out.println(nameOfIntrument + ", a " + numberOfStrings + "-stringed instrument that goes " + sound());
  }
}
