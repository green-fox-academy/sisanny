//Write a recursive function that takes one parameter: n and adds numbers from 1 to n.

public class NumberAdder {

  public static void main(String[] args) {

    System.out.println(addNumbers(5));
  }

  public static int addNumbers(int n) {
    if (n == 0) {
      return 0;
    }
    return n + addNumbers(n - 1);
  }
}
