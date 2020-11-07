package com.greenfoyacademy.evilmatrix.services;

import com.greenfoyacademy.evilmatrix.models.EvilMatrix;

import java.util.List;

public interface EvilMatrixService {
    EvilMatrix findById(int id);
    List<EvilMatrix> findAll();
    EvilMatrix findByAuthor(String author);
    void save(EvilMatrix evilMatrix);
    boolean isSquare(String matrixForm);
    //String inputMatrixToString();
    List<EvilMatrix> getListOfMatricesFromSameAuthor(String author);
}
