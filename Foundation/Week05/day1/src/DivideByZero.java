// Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0

public class DivideByZero {
  public static void main(String[] args) {
    divideByTen(2);
  }
  public static void divideByTen(int numberToDivideWith) {
    try {
      int result = 10 / numberToDivideWith;
      System.out.println(result);
    } catch (ArithmeticException e) {
      System.out.println("Can`t divide by 0");
    }
  }
}
