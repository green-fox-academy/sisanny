package com.greenfoxacademy.mywords.repository;

import com.greenfoxacademy.mywords.model.MyWord;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MyWordRepository extends CrudRepository<MyWord, Integer> {
    MyWord findById(int id);
    MyWord findByCzech(String czech);
    MyWord findByHungarian(String hun);
    boolean existsByHungarianOrCzech(String czech, String hun);
    List<MyWord> findAll();
}
