package clone;

public class Main {
  public static void main(String[] args) {
    Student alabardos = new Student("alabardos", 30, "male", "GreenFox");
    Student alabardosTheClone = alabardos.clone();

    System.out.println(alabardosTheClone.toString());
  }
}
