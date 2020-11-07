package charsequence;

public class Shifter implements CharSequence{
  private String example;
  private int number;

  public Shifter(String example, int number) {
    this.example = example;
    this.number = number;
  }

  @Override
  public int length() {
    return example.length();
  }

  @Override
  public char charAt(int index) {
    if (number > example.length() - 1) {
      return 0;
    }
    return example.charAt(index + number);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }
}
