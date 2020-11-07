package exercise10;
//Create a Fox class with 3 properties: name, color and age Fill a list with at least 5 foxes and:

//    Write a Stream Expression to find the foxes with green color!
//    Write a Stream Expression to find the foxes with green color, and age less then 5 years!
//    Write a Stream Expression to find the frequency of foxes by color!

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise10 {
    public static void main(String[] args) {

        Fox vuk = new Fox("vuk", 3, "brown");
        Fox greenFox = new Fox("greenfox", 4, "green");
        Fox mrFox = new Fox("mrFox", 6, "green");
        Fox msFox = new Fox("mrFox", 3, "black");

        List<Fox> foxes = new ArrayList();
        foxes.add(vuk);
        foxes.add(greenFox);
        foxes.add(mrFox);
        foxes.add(msFox);

        foxes.stream().filter(f -> f.getColor().equals("green")).forEach(f -> System.out.println(f.getName()));
        foxes.stream().filter(f -> f.getColor().equals("green")).filter(f -> f.getAge() < 5).forEach(f -> System.out.println(f.getName()));
        System.out.println(foxes.stream().collect(Collectors.groupingBy(f -> f.getColor(), Collectors.counting())).toString());
    }
}
