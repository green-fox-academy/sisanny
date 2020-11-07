package com.greenfoxexample.mentors.repositories;

import com.greenfoxexample.mentors.models.Mentor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MentorRepository extends CrudRepository<Mentor, Integer> {
    List<Mentor> findAll();
    void deleteById(int id);
    Mentor findById(int id);
    boolean existsById(int id);
}
