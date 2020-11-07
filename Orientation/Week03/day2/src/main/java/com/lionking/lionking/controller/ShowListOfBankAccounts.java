package com.lionking.lionking.controller;

import com.lionking.lionking.model.BankAccountList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShowListOfBankAccounts {
    BankAccountList animals = new BankAccountList();

    @GetMapping(path = "list")
    public String showListOfBankAccounts(Model model) {
        model.addAttribute("list", animals.getBankAccountList());
        return "showListTemplate";
    }
}
