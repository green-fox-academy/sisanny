package com.greenfoxacademy.mywords.services;


import com.greenfoxacademy.mywords.model.MyWord;
import com.greenfoxacademy.mywords.repository.MyWordRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MyWordServiceImpl implements MyWordService{
    final
    MyWordRepository myWordRepository;
    private List<MyWord> allOfList;

    public MyWordServiceImpl(MyWordRepository myWordRepository) {
        this.myWordRepository = myWordRepository;
    }

    @Override
    public MyWord findById(int id) {
        return myWordRepository.findById(id);
    }

    @Override
    public MyWord findByCzech(String czech) {
        return myWordRepository.findByCzech(czech);
    }

    @Override
    public MyWord findByHun(String hun) {
        return myWordRepository.findByHungarian(hun);
    }

    @Override
    public void countSearch(MyWord myWord) {
        myWord.setCount(myWord.getCount() + 1);
    }

    @Override
    public MyWord save(MyWord myWord) {
        return myWordRepository.save(myWord);
    }

    @Override
    public boolean exsist(String czech, String hun) {
        return myWordRepository.existsByHungarianOrCzech(czech, hun);
    }

    @Override
    public List<MyWord> getMostFrequentList(List<MyWord> myWordList) {
        List<MyWord> mostFrequentList = new ArrayList<>();
        List<MyWord> allOfList = myWordRepository.findAll();
        List<Integer> mostFrequent = allOfList.stream().map(MyWord::getCount).collect(Collectors.toList());
        int counter = 0;

        for (int i = 0; i < allOfList.size(); i++) {
            for (int j = 0; j < mostFrequent.size(); j++) {
                if (allOfList.get(j).getCount() == Collections.max(mostFrequent)) {
                    mostFrequentList.add(allOfList.get(j));
                    mostFrequent.remove(Collections.max(mostFrequent));
                    allOfList.remove(allOfList.get(j));
                    counter = counter + 1;

                     if (counter == 2) {
                        break;
                    }
                }
            }
        }
        return mostFrequentList;
    }

    @Override
    public List<MyWord> findAll() {
        return myWordRepository.findAll();
    }
}
