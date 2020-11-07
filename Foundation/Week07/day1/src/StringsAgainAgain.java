//Given a string, compute recursively a new string where all the adjacent chars are now separated by a *

public class StringsAgainAgain {

  public static void main(String[] args) {
    System.out.println(separateStrings("BlaBlaBla"));
  }

  public static String separateStrings(String st) {
    if(st.isEmpty()) return "";

    char ch = st.charAt(0);

    return ch + "*" + separateStrings(st.substring(1));
  }
}
