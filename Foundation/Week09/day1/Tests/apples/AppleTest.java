package apples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppleTest {
  Apple a = new Apple();

  @Test
  public void getAppleShouldPrintApple() {
    assertEquals("apple", a.getApple());
  }
}