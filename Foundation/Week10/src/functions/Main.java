package functions;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    FindAPartOfAnInteger f = new FindAPartOfAnInteger();
    int subInt = 1;
    int[] intArray = new int[] {1, 11, 43, 52, 61};

    System.out.println(Arrays.toString(f.findAPartOfAnInteger(subInt, intArray)));

    Unique u = new Unique();
    int[] numberList = new int[] {1, 11, 34, 11, 52, 61, 1, 34};

    System.out.println(u.unique(numberList));

    UniqueGF uGF = new UniqueGF();

    System.out.println(uGF.uniqueGF(numberList));
  }
}
