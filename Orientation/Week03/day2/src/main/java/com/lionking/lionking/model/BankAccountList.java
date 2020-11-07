package com.lionking.lionking.model;

import java.util.ArrayList;

public class BankAccountList {
    private ArrayList<BankAccount> bankAccountList;

    public BankAccountList() {
        this.bankAccountList = new ArrayList<BankAccount>();
        bankAccountList.add(new BankAccount("Simba", 2000, "Lion", true, true));
        bankAccountList.add(new BankAccount("Lana", 5000, "Lion", true));
        bankAccountList.add(new BankAccount("Timon", 3000, "Suricata", true));
        bankAccountList.add(new BankAccount("Mustafa", 1000, "Lion", false));
    }

    public ArrayList<BankAccount> getBankAccountList() {
        return bankAccountList;
    }
}
