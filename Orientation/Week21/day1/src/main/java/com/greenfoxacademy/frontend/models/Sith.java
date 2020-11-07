package com.greenfoxacademy.frontend.models;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Sith {
    private String text;
    private String sith_text;
    private static String[] randomStringArray = {" Bla. ", " Ble. ", " Err..err.eer. ", " Hmmm. ", " Oh. ", " Yey. "};

    public Sith() {
    }

    public Sith(String text) {
        this.text = text;
    }

    public String getSith_text() {
        return sith_text;
    }

    public String getText() {
        return text;
    }

    public void setSith_text(String sith_text) {
        this.sith_text = sith_text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String reverseEverySecondWord() {
        List<String> wordList = Arrays.asList(text.split(" "));
        Collections.reverse(wordList);
        StringBuilder sbReverseString = new StringBuilder();
        for (String word : wordList) {
            sbReverseString.append(word + " ");
        }
        return sbReverseString.substring(0, sbReverseString.length() - 1);
    }
}
