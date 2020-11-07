// When saving this quote a disk error has occurred. Please fix it.
// Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
// Using pieces of the quote variable (instead of just redefining the string)

public class TakesLonger {
  public static void main(String... args) {
    StringBuilder quote = new StringBuilder("Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.");
    String quoteToInsert = "always takes longer than";
    quote.insert(quote.indexOf("you"), quoteToInsert + " ");

    System.out.println(quote);
  }
}
