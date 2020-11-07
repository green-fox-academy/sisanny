// Add "My todo:" to the beginning of the todoText
// Add " - Download games" to the end of the todoText
// Add " - Diablo" to the end of the todoText but with indention

// Expected output:

// My todo:
//  - Buy milk
//  - Download games
//      - Diablo

public class TodoPrint {
  public static void main(String... args){
    String todoText = "- Buy Milk\n";
    String newTodoText = todoText.concat("- Download games\n") + ("  -Diablo");
    StringBuilder finalTodoText = new StringBuilder(newTodoText);
    finalTodoText.insert(0, "My todo:\n");

    System.out.println(finalTodoText);
  }
}
