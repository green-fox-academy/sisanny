//  Create a function that takes a number and an array of integers as a parameter
//  Returns the indices of the integers in the array of which the first number is a part of
//  Or returns an empty array if the number is not part of any of the integers in the array
//  Example:
    // System.out.println(subInt(1, new int[] {1, 11, 34, 52, 61}));
    // should print: `[0, 1, 4]`
    // System.out.println(subInt(9, new int[] {1, 11, 34, 52, 61}));
    // should print: '[]'

package functions;

public class FindAPartOfAnInteger {

  String strOutputArray[];

  public int[] findAPartOfAnInteger(int subInt, int [] intArray) {

    String stringArray[] = new String[intArray.length];
    int counter = 0;
    int[] outputArray = new int[intArray.length];
    strOutputArray = new String[outputArray.length - counter];


    for (int i = 0; i < intArray.length ; i++) {
      stringArray[i] = String.valueOf(intArray[i]);
      for (int j = 0; j < stringArray[i].length(); j++) {
        char charElementOfArray = stringArray[i].charAt(j);
        if (Character.toString(charElementOfArray).equals(Integer.toString(subInt))) {
          outputArray[i] = i;
        } else {
          counter = counter + 1;
        }
      }
    }
    return outputArray;
  }
}
