package com.lionking.lionking.controller;

import com.lionking.lionking.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.jws.WebParam;

@Controller
public class Show {

    BankAccount simbasBankAccount = new BankAccount("Simba", 2000, "lion", true);

    @GetMapping(path = "/show")
    public String show(Model model) {
        model.addAttribute("name", simbasBankAccount.getName());
        model.addAttribute("balance", simbasBankAccount.getBalance());
        model.addAttribute("animalType", simbasBankAccount.getAnimalType());
        return "template";
    }
}
