package com.greenfoxexample.mentors.models;

public class MentorDTO {
    private String name;

    public MentorDTO(Mentor mentor) {
        this.name = mentor.getName();
    }

    public MentorDTO() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
