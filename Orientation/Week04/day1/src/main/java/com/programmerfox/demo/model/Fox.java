package com.programmerfox.demo.model;

import java.util.ArrayList;
import java.util.List;

public class Fox {
    protected String name;
    protected String drink;
    protected String food;
    protected List<Trick> tricks;

    public Fox() {
    }

    public Fox(String name, String drink, String food, List<Trick> tricks) {
        this.name = name;
        this.drink = drink;
        this.food = food;
        this.tricks = tricks;
    }

    public Fox(String name) {
        this.name = name;
        food = "pizza";
        drink = "lemonade";
        tricks = new ArrayList<Trick>();
    }

    public Fox(String name, String drink, String food) {
        this.name = name;
        this.drink = drink;
        this.food = food;
        tricks = new ArrayList<Trick>();
    }

    public String getName() {
        return name;
    }

    public List<Trick> getTricks() {
        return tricks;
    }

    public String getDrink() {
        return drink;
    }

    public String getFood() {
        return food;
    }
}
