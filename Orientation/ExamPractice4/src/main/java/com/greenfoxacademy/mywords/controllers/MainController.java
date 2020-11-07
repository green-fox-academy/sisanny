package com.greenfoxacademy.mywords.controllers;


import com.greenfoxacademy.mywords.model.MyWord;
import com.greenfoxacademy.mywords.services.MyWordService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    final
    MyWordService myWordService;

    public MainController(MyWordService myWordService) {
        this.myWordService = myWordService;
    }

    @GetMapping(path = "/")
    public String renderMainPage(Model model) {
        MyWord myword = new MyWord();
        model.addAttribute("myword", myword);
        return "index";
    }

    @PostMapping(path = "/")
    public String postMainPage(@ModelAttribute MyWord myword, Model model) {
        if(myword == null) {
            return "redirect:/";
        } else {
            myWordService.findByHun(myword.getHungarian()).setCount(myWordService.findByHun(myword.getHungarian()).getCount() + 1);
            myWordService.save(myWordService.findByHun(myword.getHungarian()));
            model.addAttribute("myword", myWordService.findByHun(myword.getHungarian()));
            return "index";
        }
    }

    @GetMapping(path = "/suggest/{id}")
    public String renderEditPage(@PathVariable int id, Model model) {
        model.addAttribute("myword", myWordService.findById(id));
        return "edit";
    }

    @PostMapping(path = "/suggest/{id}")
    public String postEditPage(@PathVariable int id, @ModelAttribute MyWord myWord) {
        myWordService.findById(id).setCzech(myWord.getCzech());
        myWordService.findById(id).setHungarian(myWord.getHungarian());
        myWordService.save(myWordService.findById(id));
        return "redirect:/";
    }
}
