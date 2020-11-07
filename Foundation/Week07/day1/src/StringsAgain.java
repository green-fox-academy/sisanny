//Given a string, compute recursively a new string where all the 'x' chars have been removed.

public class StringsAgain {

  public static void main(String[] args) {
    System.out.println(changeLowercaseToX("BlaxBlaxBlax"));
  }

  public static String changeLowercaseToX(String st) {
    if(st.isEmpty()) return "";

    char ch = st.charAt(0);

    if (ch != 'x') return ch + changeLowercaseToX(st.substring(1));
    return changeLowercaseToX(st.substring(1));
  }
}

