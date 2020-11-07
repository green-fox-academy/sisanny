package com.lionking.lionking.model;

public class BankAccount {
    protected String name;
    protected double balance;
    protected String animalType;
    protected boolean king;
    protected boolean isGoodGuy;

    public BankAccount(String name, int balance, String animalType, boolean isGoodGuy) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        king = false;
        this.isGoodGuy = isGoodGuy;
    }

    public BankAccount(String name, int balance, String animalType, boolean king, boolean isGoodGuy) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.king = king;
        this.isGoodGuy = isGoodGuy;
    }

    public boolean isGoodGuy() {
        return isGoodGuy;
    }

    public boolean isKing() {
        return king;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public String getAnimalType() {
        return animalType;
    }
}


