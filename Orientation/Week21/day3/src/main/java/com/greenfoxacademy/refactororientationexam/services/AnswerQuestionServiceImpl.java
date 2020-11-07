package com.greenfoxacademy.refactororientationexam.services;

import com.greenfoxacademy.refactororientationexam.models.AnswerQuestion;
import com.greenfoxacademy.refactororientationexam.repositories.AnswerQuestionRepository;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class AnswerQuestionServiceImpl implements AnswerQuestionService{
    final
    AnswerQuestionRepository answerQuestionRepository;

    public AnswerQuestionServiceImpl(AnswerQuestionRepository answerQuestionRepository) {
        this.answerQuestionRepository = answerQuestionRepository;
    }

    @Override
    public AnswerQuestion findByQuestion(String question) {
        return answerQuestionRepository.findByQuestion(question);
    }

    @Override
    public void save(AnswerQuestion AandQ) {
        answerQuestionRepository.save(AandQ);
    }

    @Override
    public AnswerQuestion getRandomQuestion(List<AnswerQuestion> questions, int numberOfQuestions) {
        List<AnswerQuestion> randomQuestions = new ArrayList<>();
        List<AnswerQuestion> copy = new ArrayList<>(questions);
        Random random = new Random();
        SecureRandom rand = new SecureRandom();

        for (int i = 0; i < Math.min(numberOfQuestions, questions.size()); i++) {
            randomQuestions.add( copy.remove( rand.nextInt(copy.size())));
        }
        return randomQuestions.get(random.nextInt(randomQuestions.size()));
    }

    @Override
    public List<AnswerQuestion> findAll() {
        return (List<AnswerQuestion>) answerQuestionRepository.findAll();
    }
}
