package com.greenfoxacademy.refactororientationexam.controllers;

import com.greenfoxacademy.refactororientationexam.models.AnswerQuestion;
import com.greenfoxacademy.refactororientationexam.services.AnswerQuestionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class QuestionController {
    final
    AnswerQuestionService answerQuestionService;

    public QuestionController(AnswerQuestionService answerQuestionService) {
        this.answerQuestionService = answerQuestionService;
    }

    @GetMapping(path = "/question")
    public String renderAddNewQuestion(Model model) {
        model.addAttribute("AandQ", new AnswerQuestion());
        return "question";
    }

    @PostMapping(path = "/question")
    public String postAddNewQuestion(@ModelAttribute AnswerQuestion AandQForm) {
        if(AandQForm == null) {
            return "question";
        } else {
            AnswerQuestion answerQuestion = new AnswerQuestion(AandQForm.getQuestion(), AandQForm.getAnswer0(), AandQForm.getAnswer1(),
                                                                                        AandQForm.getAnswer2(), AandQForm.getAnswer3());
            answerQuestion.setCorrectAnswer(AandQForm.getCorrectAnswer());
            answerQuestionService.save(answerQuestion);
            return "redirect:/home";
        }
    }
}
