package com.greenfoxacademy.mywords.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class MyWord {

    @javax.persistence.Id
    @GeneratedValue
    private int id;

    @Column(name = "hungarian")
    private String hungarian;

    @Column
    private String czech;

    @Column
    private int count;

    public MyWord() {
    }

    public MyWord(int id, String hungarian, String czech, int count) {
        this.id = id;
        this.hungarian = hungarian;
        this.czech = czech;
        this.count = count;
    }

    public MyWord(String word) {
    }

    public int getId() {
        return id;
    }

    public String getHungarian() {
        return hungarian;
    }

    public String getCzech() {
        return czech;
    }

    public int getCount() {
        return count;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setHungarian(String hungarian) {
        this.hungarian = hungarian;
    }

    public void setCzech(String czech) {
        this.czech = czech;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
