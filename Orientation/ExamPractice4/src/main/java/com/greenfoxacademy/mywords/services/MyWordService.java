package com.greenfoxacademy.mywords.services;

import com.greenfoxacademy.mywords.model.MyWord;

import java.util.List;

public interface MyWordService {
    MyWord findById(int id);
    MyWord findByCzech(String czech);
    MyWord findByHun(String hun);
    void countSearch(MyWord myWord);
    MyWord save(MyWord myWord);
    boolean exsist(String czech, String hun);
    List<MyWord> getMostFrequentList(List<MyWord> myWordList);
    List<MyWord> findAll();
}
