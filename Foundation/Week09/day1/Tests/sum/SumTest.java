package sum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumTest {
  private Sum newS;

  @BeforeEach
  public void setup() {
    newS = new Sum();
  }

  @Test
  public void sumMethodShouldSumTheNumbersInTheList() {
    int result = newS.sumOfList(Arrays.asList(2,3,9));
    assertEquals(14, result);
  }

  @Test
    public void testIfTheListIsEmpty() {
      int result = newS.sumOfList(Collections.emptyList());
      assertEquals(0,result);
    }

  @Test
  public void testWhatIsTheValueOfTheNumberInTheList() {
    int result = newS.sumOfList(Arrays.asList(2));
    assertEquals(2,2);
  }

}