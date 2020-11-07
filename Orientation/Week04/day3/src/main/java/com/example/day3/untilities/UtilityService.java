package com.example.day3.untilities;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class UtilityService {

    private List<String> colors;
    private Random random;
    private Boolean isValid;

    public UtilityService() {
        colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("lime");
        colors.add("orange");
        colors.add("magenta");
        random = new Random();
    }

    public String randomColor() {
        return colors.get(random.nextInt(colors.size()));
    }

    public Boolean getValid() {
        return isValid;
    }

    public String validateEmail(String email) {
        String result;
        //this.isValid = isValid;
        if (email.contains("@") && email.contains(".")) {
            result = email + " is a valid email address";
            isValid = true;
        } else {
            result = email + " is not a valid email address";
            isValid = false;
        }
        return result;
    }

    public String caesar(String text, int number) {
        if (number < 0) {
            number = 26 + number;
        }

        String result = "";
        for (int i = 0; i < text.length(); i++) {
            int offset = Character.isUpperCase(text.charAt(i)) ? 'A' : 'a';
            result += (char) (((int) text.charAt(i) + number - offset) % 26 + offset);
        }
        return result;
    }
}
