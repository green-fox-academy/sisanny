package com.greenfoxacademy.springgeneral.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Meal {

    @Id
    @GeneratedValue
    private int id;

    @Column
    private String name;

    @Column
    private int calories;

    @Column
    private Date date;

    public Meal() {
    }

    public Meal(int id, String name, int calories, Date date) {
        this.id = id;
        this.name = name;
        this.calories = calories;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
