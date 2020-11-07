package functions;

import java.util.Arrays;

public class UniqueGF {

  public int[] uniqueGF(int[] input){
    int[] occurrenceCounter = new int[input.length];
    int douplicationCounter = 0;

    // Fill occurrenceCounter with 1 when duplicated and 0 when not
    // Count duplication in douplicationCounter:
    for (int i = 0; i < input.length; i++) {
      int checkedNumber = input[i];

      for (int j = i+1; j < input.length ; j++) {
        if (checkedNumber == input[j]){
          occurrenceCounter[i] = 1;
          douplicationCounter ++;
        }
      }
    }

    // Create a new array with the proper size:
    int[] result = new int[input.length - douplicationCounter];

    // Populate result based on occurrenceCounter:
    int resultIndex = 0;
    for (int i = 0; i < occurrenceCounter.length; i++) {
      if (occurrenceCounter[i] == 0){
        result[resultIndex] = input[i];
        resultIndex++;
      }
    }

    Arrays.sort(result);
    return result;
  }
}

