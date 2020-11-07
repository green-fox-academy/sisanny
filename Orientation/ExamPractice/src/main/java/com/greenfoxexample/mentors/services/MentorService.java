package com.greenfoxexample.mentors.services;

import com.greenfoxexample.mentors.models.Mentor;
import com.greenfoxexample.mentors.models.MentorDTO;

import java.util.List;

public interface MentorService {
    Mentor findById(int id);
    boolean exist(int id);
    List<Mentor> findAll();
    void save(Mentor mentor);
    void deleteById(int id);
    boolean isCorrectClassName(String className);
    List<Mentor> findAllReally(List<Mentor> mentors);
    List<MentorDTO> makeMentorDTOList(List<Mentor> mentors);
}
