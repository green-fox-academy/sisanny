//  Create a function that takes a list of numbers as a parameter
//  Returns a list of numbers where every number in the list occurs only once

//  Example
    // System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
    //  should print: `[1, 11, 34, 52, 61]`

package functions;

import java.util.Arrays;

public class Unique {

  public int[] unique(int[] numberList) {
    int[] occurenceCheck = new int[numberList.length];
    int dupNr = 0;

    for (int i = 0; i <numberList.length ; i++) {
      int checkedNr = numberList[i];

      for (int j = 0; j < numberList.length; j++) {
        if (checkedNr == numberList[j]){
          occurenceCheck[i] = 1;
          dupNr++;
        }
      }
    }
    int[] outPut = new int[numberList.length - dupNr];

    int outPutIndex = 0;
    for (int i = 0; i < occurenceCheck.length; i++) {
      if(occurenceCheck[i] == 0) {
        outPut[outPutIndex] = numberList[i];
        outPutIndex++;
      }
    }
    Arrays.sort(outPut);
    return outPut;
  }
}
