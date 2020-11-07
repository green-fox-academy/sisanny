//Given a non-negative integer n, return the sum of its digits recursively (without loops).

public class SumDigit {

  public static void main(String[] args) {

    System.out.println(sumNumbers(126));
  }

  public static int sumNumbers(int n) {
    if (n == 0) return 0;
    int rightMost = n % 10;
    int removedRightMost = n / 10;

    return rightMost + sumNumbers(removedRightMost);
  }
}
