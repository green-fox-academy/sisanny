package com.greenfoxexample.mentors.conrtollers;

import com.greenfoxexample.mentors.models.Mentor;
import com.greenfoxexample.mentors.services.MentorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    final
    MentorService mentorService;

    public MainController(MentorService mentorService) {
        this.mentorService = mentorService;
    }

    @GetMapping(path = "/")
    public String renderMainPage(Model model) {
        model.addAttribute("mentorList", mentorService.findAll());
        return "index";
    }

    @PostMapping(path = "/mentor")
    public String postMainPage(@RequestParam(name = "name") String nameForm, @RequestParam(name = "class") String classForm) {
        Mentor mentor = new Mentor();
        mentor.setName(nameForm);
        mentor.setClassName(classForm);
        mentorService.save(mentor);
        return "redirect:/mentor/" + mentor.getId();
    }

    @GetMapping(path = "/mentor/{id}")
    public String renderMentorPage(@PathVariable int id, Model model) {
        if (mentorService.exist(id)) {
            model.addAttribute("mentor", mentorService.findById(id));
            return "mentor";
        } else {
            return "error";
        }
    }
}
