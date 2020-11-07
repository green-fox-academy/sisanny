package com.greenfoxexample.mentors.services;

import com.greenfoxexample.mentors.models.Mentor;
import com.greenfoxexample.mentors.models.MentorDTO;
import com.greenfoxexample.mentors.repositories.MentorRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MentorServiceImplement implements MentorService{
    final
    MentorRepository mentorRepository;

    public MentorServiceImplement(MentorRepository mentorRepository) {
        this.mentorRepository = mentorRepository;
    }

    @Override
    public Mentor findById(int id) {
        return mentorRepository.findById(id);
    }

    @Override
    public boolean exist(int id) {
        return mentorRepository.existsById(id);
    }

    @Override
    public List<Mentor> findAll() {
        return mentorRepository.findAll();
    }

    @Override
    public void save(Mentor mentor) {
        mentorRepository.save(mentor);
    }

    @Override
    public void deleteById(int id) {
        mentorRepository.deleteById(id);
    }

    @Override
    public boolean isCorrectClassName(String className) {
        String[] listOfClassnames = {"Tiptop", "Really", "Really", "Seadog"};
        int counter = 0;
        for (String listOfClassname : listOfClassnames) {
            if (listOfClassname.equals(className)) {
                counter = counter + 1;
            }
        }
        return counter > 0;
    }

    @Override
    public List<Mentor> findAllReally(List<Mentor> mentors) {
        return mentorRepository.findAll().stream().filter(mentor -> mentor.getClassName().equals("Really")).collect(Collectors.toList());
    }

    @Override
    public List<MentorDTO> makeMentorDTOList(List<Mentor> mentors) {
        List<MentorDTO> mentorDTOS = new ArrayList<>();
        for (int i = 0; i < findAllReally(mentors).size(); i++) {
            mentorDTOS.add(new MentorDTO(mentors.get(i)));
        }
        return mentorDTOS;
    }
}
