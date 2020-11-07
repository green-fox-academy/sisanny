package com.greenfoyacademy.evilmatrix.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class EvilMatrix {

    @Id
    @GeneratedValue
    private int id;

    @Column
    private String matrix;

    @Column
    private String author;

    @Column
    private boolean isSquare;

    public EvilMatrix() {
    }

    public EvilMatrix(String matrix, String author) {
        this.matrix = matrix;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMatrix() {
        return matrix;
    }

    public void setMatrix(String matrix) {
        this.matrix = matrix;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isSquare() {
        return isSquare;
    }

    public void setSquare(boolean square) {
        isSquare = square;
    }
}
