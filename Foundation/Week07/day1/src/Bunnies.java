//We have a number of bunnies and each bunny has two big floppy ears.
//We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).

public class Bunnies {

  public static void main(String[] args) {
    System.out.println(countNumberOfEars(7));
  }

  public static int countNumberOfEars(int numberOfBunnies) {
    if (numberOfBunnies <= 0) return 0;

    return 2 + countNumberOfEars(numberOfBunnies - 1);
  }
}
