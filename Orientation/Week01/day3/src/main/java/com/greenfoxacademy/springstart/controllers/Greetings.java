package com.greenfoxacademy.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;

public class Greetings {
    protected AtomicLong greetCounter;
    protected String content;


    public Greetings(String content, AtomicLong greetCounter) {
        this.greetCounter = greetCounter;
        this.content = content;
    }

    public AtomicLong getGreetCounter() {
        return greetCounter;
    }

    public void setGreetCounter(AtomicLong greetCounter) {
        this.greetCounter = greetCounter;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
