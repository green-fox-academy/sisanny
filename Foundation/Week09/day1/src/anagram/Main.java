package anagram;

public class Main {
  public static void main(String[] args) {
    Anagram a = new Anagram();

    Boolean result = a.isAnagram("anna", "nana");

    System.out.println(result);
  }

}
