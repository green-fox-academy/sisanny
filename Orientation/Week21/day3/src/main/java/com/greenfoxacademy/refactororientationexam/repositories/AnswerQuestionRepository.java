package com.greenfoxacademy.refactororientationexam.repositories;

import com.greenfoxacademy.refactororientationexam.models.AnswerQuestion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerQuestionRepository extends CrudRepository<AnswerQuestion, String> {
    AnswerQuestion findByQuestion(String question);
}
