//We are going to represent our contacts in a map where the keys are going to be strings and the values are going to be strings as well.
//Create an application which solves the following problems.
//What is John K. Miller's phone number?
//Whose phone number is 307-687-2982?
//Do we know Chris E. Myers' phone number?

import java.util.HashMap;
import java.util.Map;

public class TelephoneBook {

  public static String findTheNumberOFJKM(HashMap telephoneBook) {
    String numberOFJKM = (String) telephoneBook.get("John K. Miller");
    return numberOFJKM;
  }

  public static void main(String[] args) {
    HashMap<String, String> telephoneBook = new HashMap<String, String>();
    telephoneBook.put("William A. Lathan", "405-709-1865");
    telephoneBook.put("John K. Miller", "402-247-8568");
    telephoneBook.put("Hortensia E. Foster", "606-481-6467");
    telephoneBook.put("Amanda D. Newland", "319-243-5613");
    telephoneBook.put("Brooke P. Askew", "307-687-2982");
    System.out.println(findTheNumberOFJKM(telephoneBook));

    for (Map.Entry<String, String> number : telephoneBook.entrySet()) {
      if (number.getValue().equals("307-687-2982")) {
        System.out.println(number.getKey());
      }
    }
    for (Map.Entry<String, String> person : telephoneBook.entrySet()) {
      if (person.getKey().equals("Chris E. Myers")) {
        System.out.println(person.getKey());
      } else {
        System.out.println("There is no Chris E. Myers in you Telephone Book");
        break;
      }
    }
  }
}
