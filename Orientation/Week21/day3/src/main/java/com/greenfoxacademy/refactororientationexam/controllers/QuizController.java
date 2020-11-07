package com.greenfoxacademy.refactororientationexam.controllers;

import com.greenfoxacademy.refactororientationexam.models.AnswerQuestion;
import com.greenfoxacademy.refactororientationexam.services.AnswerQuestionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QuizController {

    final
    AnswerQuestionService answerQuestionService;

    public QuizController(AnswerQuestionService answerQuestionService) {
        this.answerQuestionService = answerQuestionService;
    }

    @GetMapping(path = "/quiz")
    public String renderQuiz(Model model) {
        if(answerQuestionService.findAll() == null || answerQuestionService.findAll().isEmpty()) {
            return "redirect:/home";
        }else {
            AnswerQuestion answerQuestion = answerQuestionService.getRandomQuestion(answerQuestionService.findAll(), answerQuestionService.findAll().size());
            model.addAttribute("randomQuestion", answerQuestion);
        }
        return "quiz";
    }
}
