//Check out the CharSequence interface
//Create a Gnirts class implementing this interface
//It should have one String field that can be set via the constructor
//Implementing the interface's methods, always think of the field as if it was backwards,
// so at the second position of "this example" there is a 'p'
//In a main method try out all the methods
//Create a Shifter class implementing this interface
//This charsequence can be set up with a string (that is to be shifted)
// and a number (which will tell how many to shift)
//Implement the methods so the returned results of them will be shifted

package charsequence;

public class Gnirts implements CharSequence {
  private String example;

  public Gnirts(String example) {
    this.example = example;
  }

  @Override
  public int length() {
    return example.length();
  }

  @Override
  public char charAt(int index) {
    return example.charAt((length() - 1)- index);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }


}
