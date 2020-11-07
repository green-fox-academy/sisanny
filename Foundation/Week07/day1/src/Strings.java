//Given a string, compute recursively (no loops)
//a new string where all the lowercase 'x' chars have been changed to 'y' chars.

public class Strings {

  public static void main(String[] args) {
    System.out.println(changeLowercaseToX("BlaBlaBla"));
  }

  public static String changeLowercaseToX(String st) {
    if(st.isEmpty()) return "";

    char ch = st.charAt(0);

    if (!Character.isLowerCase(ch)) return ch + changeLowercaseToX(st.substring(1));
    return 'x' + changeLowercaseToX(st.substring(1));
  }
}
