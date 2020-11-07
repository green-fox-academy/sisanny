package com.greenfoxacademy.refactororientationexam.services;

import com.greenfoxacademy.refactororientationexam.models.AnswerQuestion;

import java.util.List;

public interface AnswerQuestionService {
    AnswerQuestion findByQuestion(String question);

    void save(AnswerQuestion AandQ);

    AnswerQuestion getRandomQuestion(List<AnswerQuestion> questions, int numberOfQuestions);

    List<AnswerQuestion> findAll();
}

