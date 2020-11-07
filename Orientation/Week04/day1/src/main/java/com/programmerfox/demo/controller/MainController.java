
package com.programmerfox.demo.controller;

import com.programmerfox.demo.model.Fox;
import com.programmerfox.demo.model.FoxesList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping(path = "/")
    public String homePage(Model model, @RequestParam(name = "name") String name) {
        FoxesList foxes = new FoxesList();
        Fox fox = foxes.checkFoxes(name);
        if (fox == null) {
            Fox newFox = new Fox(name);
            foxes.addFox(newFox);
            model.addAttribute("fox", newFox);
        } else {
            model.addAttribute("fox", fox);
        }
        return "index";
    }

    @GetMapping(path = "/login")
    public String login(Model model, @RequestParam(name = "error", required = false, defaultValue = "false") boolean error) {
        model.addAttribute("error", error);
        return "login";
    }

    @PostMapping(path = "/login")
    public String postLogin(@RequestParam(name = "name") String fox) {
        return "redirect:/?name=" + fox;
    }
}
